package appointment.system;

import JPAEntities.AppointmentEntity;
import JPAEntities.AppointmentStateEntity;
import JPAEntities.DoctorEntity;
import JPAEntities.PatientEntity;
import control.Factory;
import doctor.system.DoctorDAO;
import doctor.system.IDoctorDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import patient.system.IPatientDAO;

/**
 *
 * @author TeLesheo
 */
public abstract class AppointmentManager implements IAppointmentManager {

    private AppointmentManager() {
    }

    @Override
    public void createAppointment(NewAppointmentDTO newAppointmentDTO) {
        AppointmentEntity appointment = DtoToEntity(newAppointmentDTO);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(appointment);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public AppointmentEntity DtoToEntity(NewAppointmentDTO newAppointmentDTO) {

        IDoctorDAO doctorDAO = Factory.getDoctorDAO();
        DoctorEntity doctor = doctorDAO.serachById(newAppointmentDTO.getDoctor().getId());
        AppointmentEntity appointment = new AppointmentEntity();
        appointment.setDoctor(doctor);

        IPatientDAO patientD = Factory.getPatientDAO();
        PatientEntity patient = patientD.searchPatientByCurp(newAppointmentDTO.getPatient().getCurp());
        appointment.setPatient(patient);

        appointment.setAppointmentDate(newAppointmentDTO.getAppointmentDate());
        appointment.setAppointmentState(AppointmentStateEntity.ACTIVE);

        return appointment;
    }

    public static AppointmentManager getInstance() {
        return new AppointmentManager() {
        };
    }

}
