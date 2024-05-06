package doctor.system;

import JPAEntities.DoctorEntity;
import JPAEntities.Specialization;
import connection.ConnectionDB;
import connection.IConnectionDB;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import patient.system.PatientDAO;

/**
 *
 * @author TeLesheo
 */
public class DoctorDAO implements IDoctorDAO {

    private static final Logger LOGGER = Logger.getLogger(PatientDAO.class.getName());
    private EntityManagerFactory emf;
    private EntityManager em;

    public DoctorDAO() {

        IConnectionDB connection = new ConnectionDB();
        emf = connection.createConnection();
        em = emf.createEntityManager();

    }

    @Override
    public void registerDoctor(NewDoctorDTO doctorDTO) {
        DoctorEntity doctor = DtoToEntity(doctorDTO);
        doctor.setSpecialization(setSpecilaization(doctorDTO.getSpecialization()));
        em.getTransaction().begin();
        em.persist(doctor);
        em.getTransaction().commit();
//        em.close();
//        emf.close();
    }

    public Specialization setSpecilaization(String string){
        
        return switch (string) {
            case "PEDIATRIC" ->
                Specialization.PEDIATRIC;
            case "SURGERY" ->
                Specialization.SURGERY;
            case "PSYCHIATRY" ->
                Specialization.PSYCHIATRY;
            case "ANESTHIOLOGY" ->
                Specialization.ANESTHIOLOGY;
            case "FAMILY" ->
                Specialization.FAMILY;
            case "CARDIOLOGY" ->
                Specialization.CARDIOLOGY;
            default ->
                null;
        };
    
    }
    
    @Override
    public DoctorEntity DtoToEntity(NewDoctorDTO doctorDTO) {

        DoctorEntity doctor = new DoctorEntity();
        doctor.setNames(doctorDTO.getName());
        doctor.setFirstLastName(doctorDTO.getFirstName());
        doctor.setSecondLastName(doctorDTO.getSecondName());
        doctor.setMedicalCart(doctorDTO.getMedicalCart());
        doctor.setSpecialization(JPAEntities.Specialization.FAMILY);

        return doctor;
    }
    
    @Override
    public DoctorEntity ExistentDtoToEntity(ExistentDoctorDTO existentDoctorDTO) {

        return em.find(DoctorEntity.class, existentDoctorDTO.getId());

    }

    @Override
    public DoctorEntity serachById(Long idDoctor) {

        try {
            return em.find(DoctorEntity.class, idDoctor);
        } catch (NoResultException e) {
            LOGGER.log(Level.INFO, "No se encontró ningún doctor con el ID especificado.");
            return null;
        } finally {
//            em.close();
//            emf.close();
        }
    }

    @Override
    public DoctorEntity searchByMedicart(String medicart) {

        try {
            TypedQuery<DoctorEntity> query = em.createQuery("SELECT d FROM DoctorEntity d WHERE d.medicalCart = :medicalCart", DoctorEntity.class);
            query.setParameter("medicalCart", medicart);
            return query.getSingleResult();
        } catch (NoResultException e) {
            LOGGER.log(Level.INFO, "No se encontró ningún Doctor con el medicalCart especificado.");
            return null;
        } finally {
//            em.close();
//            emf.close();
        }
    }

    public static DoctorDAO getInstance() {
        return new DoctorDAO() {
        };
    }
    
    @Override
    public List<ExistentDoctorDTO> searchBySpecialization(Specialization specialization) {
        List<ExistentDoctorDTO> doctorsDTO = new ArrayList<>();

        try {
            TypedQuery<DoctorEntity> query = em.createQuery("SELECT d FROM DoctorEntity d WHERE d.specialization = :specialization", DoctorEntity.class);
            query.setParameter("specialization", specialization);
            List<DoctorEntity> doctors = query.getResultList();

            for (DoctorEntity doctor : doctors) {
                ExistentDoctorDTO doctorDTO = EntityToDTO(doctor);
                doctorsDTO.add(doctorDTO);
            }
        } catch (Exception e) {
            LOGGER.log(Level.INFO, "Error al buscar médicos por especialización: " + e.getMessage());
        } finally {
//            em.close();
//            emf.close();
        }

        return doctorsDTO;
    }

    public ExistentDoctorDTO EntityToDTO(DoctorEntity doctorEntity) {
        ExistentDoctorDTO doctorDTO = new ExistentDoctorDTO();
        doctorDTO.setId(doctorEntity.getId());
        doctorDTO.setName(doctorEntity.getNames());
        doctorDTO.setFirstName(doctorEntity.getFirstLastName());
        doctorDTO.setSecondName(doctorEntity.getSecondLastName());
        doctorDTO.setSpecialization(doctorEntity.getSpecialization());
        doctorDTO.setMedicalCart(doctorEntity.getMedicalCart());
        return doctorDTO;
    }

}
