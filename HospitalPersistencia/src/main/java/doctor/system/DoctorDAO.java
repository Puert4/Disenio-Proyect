package doctor.system;

import JPAEntities.DoctorEntity;
import connection.ConnectionDB;
import connection.IConnectionDB;
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
    
    public DoctorDAO(){
        
        IConnectionDB connection = new ConnectionDB();
        emf = connection.createConnection();
        em = emf.createEntityManager();
        
    }
    
    @Override
    public void registerDoctor(NewDoctorDTO doctorDTO) {
        DoctorEntity doctor = DtoToEntity(doctorDTO);
        em.getTransaction().begin();
        em.persist(doctor);
        em.getTransaction().commit();
        em.close();
        emf.close();
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
    public DoctorEntity serachById(Long idDoctor) {

        try {
            return em.find(DoctorEntity.class, idDoctor);
        } catch (NoResultException e) {
            LOGGER.log(Level.INFO, "No se encontró ningún doctor con el ID especificado.");
            return null;
        } finally {
            em.close();
            emf.close();
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
            em.close();
            emf.close();
        }
    }

    public static DoctorDAO getInstance() {
        return new DoctorDAO() {
        };
    }
}
