package appointment.system;

import JPAEntities.AppointmentEntity;
import JPAEntities.AppointmentStateEntity;
import JPAEntities.DoctorEntity;
import JPAEntities.PatientEntity;
import connection.ConnectionDB;
import connection.IConnectionDB;
import doctor.system.ExistentDoctorDTO;
import doctor.system.IDoctorDAO;
import factory.Factory;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import patient.system.ExistentPatientDTO;
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
    public List<Calendar> findLimitDays(DoctorEntity doctorEntity) {

        System.out.println(doctorEntity);

        CriteriaBuilder criteria = em.getCriteriaBuilder();
        CriteriaQuery<AppointmentEntity> consulta = criteria.createQuery(AppointmentEntity.class);
        Root<AppointmentEntity> root = consulta.from(AppointmentEntity.class);

        consulta = consulta.select(root).where(criteria.equal(root.get("doctor"), doctorEntity));

        TypedQuery<AppointmentEntity> query = em.createQuery(consulta);
        List<AppointmentEntity> ams = query.getResultList();

        List<Calendar> limitDays = new ArrayList<>();
        System.out.println("Tamaño: " + ams.size());
        for (AppointmentEntity appointmentEntity : ams) {
            System.out.println("Dias" + appointmentEntity.getAppointmentDate().get(Calendar.DAY_OF_MONTH));
            limitDays.add(appointmentEntity.getAppointmentDate());
        }

        return limitDays;

    }

    @Override
    public void createAppointment(NewAppointmentDTO newAppointmentDTO) {
        AppointmentEntity appointment = DtoToEntity(newAppointmentDTO);

        em.getTransaction().begin();
        em.persist(appointment);
        em.getTransaction().commit();
//        em.close();
//        emf.close();
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
        appointment.setNote(newAppointmentDTO.getNote());

        return appointment;
    }

//       @Override
//    public List<AppointmentEntity> findAppointmentsByPatientId(Long patientId) {
//        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
//        CriteriaQuery<AppointmentEntity> criteriaQuery = criteriaBuilder.createQuery(AppointmentEntity.class);
//        Root<AppointmentEntity> root = criteriaQuery.from(AppointmentEntity.class);
//        Join<AppointmentEntity, PatientEntity> patientJoin = root.join("patient");
//        criteriaQuery.select(root)
//                    .where(criteriaBuilder.equal(patientJoin.get("id"), patientId));
//        TypedQuery<AppointmentEntity> query = em.createQuery(criteriaQuery);
//        return query.getResultList();
//    }
    @Override
    public List<ExistentAppointmentDTO> findAppointmentsByPatientId(Long patientId) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<AppointmentEntity> criteriaQuery = criteriaBuilder.createQuery(AppointmentEntity.class);
        Root<AppointmentEntity> root = criteriaQuery.from(AppointmentEntity.class);
        Join<AppointmentEntity, PatientEntity> patientJoin = root.join("patient");
        criteriaQuery.select(root)
                .where(criteriaBuilder.equal(patientJoin.get("id"), patientId));
        TypedQuery<AppointmentEntity> query = em.createQuery(criteriaQuery);
        List<AppointmentEntity> appointmentEntities = query.getResultList();

        return appointmentEntities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public ExistentAppointmentDTO convertToDTO(AppointmentEntity appointmentEntity) {

        IDoctorDAO doctorDAO = Factory.getDoctorDAO();
        ExistentDoctorDTO doctorDTO = doctorDAO.EntityToDTO(doctorDAO.serachById(appointmentEntity.getDoctor().getId()));

        IPatientDAO patientDAO = Factory.getPatientDAO();
        ExistentPatientDTO patientDTO = patientDAO.EntityToDto(patientDAO.serachPatientById(appointmentEntity.getPatient().getId()));
        //  ExistentPatientDTO patientDTO = new ExistentPatientDTO();
        // patientDTO.setId(appointmentEntity.getPatient().getId());

        // Set other patientDTO properties as needed
        ExistentAppointmentDTO appointmentDTO = new ExistentAppointmentDTO();
        appointmentDTO.setId(appointmentEntity.getId());
        appointmentDTO.setDoctor(doctorDTO);
        appointmentDTO.setPatient(patientDTO);
        appointmentDTO.setAppointmentDate(appointmentEntity.getAppointmentDate());
        appointmentDTO.setStatus(appointmentEntity.getAppointmentState().toString());
        appointmentDTO.setNote(appointmentEntity.getNote());

        return appointmentDTO;
    }

    public static AppointmentManager getInstance() {
        return new AppointmentManager() {
        };
    }

}
