package administrator.system;

import JPAEntities.AdministratorEntity;
import JPAEntities.PatientEntity;
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
public class AdministratorDAO implements IAdministratorDAO {

    private static final Logger LOGGER = Logger.getLogger(PatientDAO.class.getName());

    @Override
    public void registerAdministrator(newAdministratorDTO administratorDTO) {

        AdministratorEntity administrator = DtoToEntity(administratorDTO);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(administrator);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public AdministratorEntity DtoToEntity(newAdministratorDTO administratorDTO) {
        AdministratorEntity adminisrator = new AdministratorEntity();

        adminisrator.setNames(administratorDTO.getName());

        return adminisrator;
    }

    @Override
    public ExistentAdministratorDTO EntityToDto(AdministratorEntity administrator) {
        ExistentAdministratorDTO administratorDTO = new ExistentAdministratorDTO();
        administratorDTO.setId(administrator.getId());
        administratorDTO.setName(administrator.getNames());
        return administratorDTO;
    }

    @Override
    public AdministratorEntity searchAdministratorByName(String names) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<AdministratorEntity> query = em.createQuery("SELECT a FROM AdministratorEntity a WHERE a.names = :names", AdministratorEntity.class);
            query.setParameter("names", names);
            return query.getSingleResult();
        } catch (NoResultException e) {
            LOGGER.log(Level.INFO, "No se encontró ningún paciente con el CURP especificado.");
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }

    public static AdministratorDAO getInstance() {
        return new AdministratorDAO() {
        };
    }

}
