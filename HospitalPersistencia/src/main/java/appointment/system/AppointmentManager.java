package appointment.system;

import JPAEntities.AppointmentEntity;
import JPAEntities.AppointmentStateEntity;
import JPAEntities.DoctorEntity;
import JPAEntities.PatientEntity;
import connection.ConnectionDB;
import connection.IConnectionDB;
import doctor.system.IDoctorDAO;
import factory.Factory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import patient.system.IPatientDAO;

/**
 *
 * @author TeLesheo
 */
public abstract class AppointmentManager implements IAppointmentManager {

    private EntityManagerFactory emf;
    private EntityManager em;

    private AppointmentManager() {

        IConnectionDB connection = new ConnectionDB();
        emf = connection.createConnection();
        em = emf.createEntityManager();

    }

    @Override
    public void createAppointment(NewAppointmentDTO newAppointmentDTO) {
        AppointmentEntity appointment = DtoToEntity(newAppointmentDTO);

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
