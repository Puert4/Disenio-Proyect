package patient.system;

import JPAEntities.PatientEntity;
import connection.ConnectionDB;
import connection.IConnectionDB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author TeLesheo
 */
public class PatientDAO implements IPatientDAO {

    private static final Logger LOGGER = Logger.getLogger(PatientDAO.class.getName());
    private EntityManagerFactory emf;
    private EntityManager em;

    public PatientDAO() {

        IConnectionDB connection = new ConnectionDB();
        emf = connection.createConnection();
        em = emf.createEntityManager();

    }

    @Override
    public void registerPatient(NewPatientDTO newPatientDTO) {
        PatientEntity patient = DtoToEntity(newPatientDTO);
        em.getTransaction().begin();
        em.persist(patient);
        em.getTransaction().commit();
//        em.close();
//        emf.close();

    }

    @Override
    public PatientEntity serachPatientById(Long idPatient) {

        try {
            // Consulta el paciente por su ID
            return em.find(PatientEntity.class, idPatient);

        } catch (NoResultException e) {
            LOGGER.log(Level.INFO, "No se encontró ningún paciente con el ID especificado.");
            return null;
        } finally {
//            em.close();
//            emf.close();
        }
    }

    @Override
    public PatientEntity searchPatientByCurp(String curp) {
        try {
            TypedQuery<PatientEntity> query = em.createQuery("SELECT p FROM PatientEntity p WHERE p.curp = :curp", PatientEntity.class);
            query.setParameter("curp", curp);
            return query.getSingleResult();
        } catch (NoResultException e) {
            LOGGER.log(Level.INFO, "No se encontró ningún paciente con el CURP especificado.");
            return null;
        } finally {
//            em.close();
//            emf.close();
        }
    }

    @Override
    public ExistentPatientDTO EntityToDto(PatientEntity patient) {
        ExistentPatientDTO existentPatientDTO = new ExistentPatientDTO();
        existentPatientDTO.setId(patient.getId());
        existentPatientDTO.setName(patient.getNames());
        existentPatientDTO.setFirstName(patient.getFirstName());
        existentPatientDTO.setSecondName(patient.getSecondName());
        existentPatientDTO.setCurp(patient.getCurp());
        existentPatientDTO.setPhone(patient.getPhone());
        existentPatientDTO.setBirthDate(patient.getBirthDate());
        existentPatientDTO.setSex(patient.getSex());
        existentPatientDTO.setStreet(patient.getStreet());
        existentPatientDTO.setZipCode(patient.getZipCode());
        existentPatientDTO.setColonia(patient.getColony());
        existentPatientDTO.setSocialNumber(patient.getSocialNumber());

        return existentPatientDTO;
    }

    @Override
    public PatientEntity DtoToEntity(NewPatientDTO newPatientDTO) {
        PatientEntity patient = new PatientEntity();

        patient.setNames(newPatientDTO.getNames());
        patient.setFirstName(newPatientDTO.getFirstName());
        patient.setSecondName(newPatientDTO.getSecondName());
        patient.setCurp(newPatientDTO.getCurp());
        patient.setPhone(newPatientDTO.getPhone());
        patient.setBirthDate(newPatientDTO.getBirthDate());
        patient.setSex(newPatientDTO.getSex());
        patient.setStreet(newPatientDTO.getStreet());
        patient.setZipCode(newPatientDTO.getZipCode());
        patient.setColony(newPatientDTO.getColony());
        patient.setSocialNumber(newPatientDTO.getSocialNumber());

        return patient;
    }

    public static PatientDAO getInstance() {
        return new PatientDAO() {
        };
    }
}
