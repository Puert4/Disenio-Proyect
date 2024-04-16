package searches;

import JPAEntities.Patient;
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
public abstract class Search implements ISearch {

    private static final Logger LOGGER = Logger.getLogger(Search.class.getName());

    private Search() {

    }

    @Override
    public Patient serachPatientById(Long idPatient) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();

        try {
            // Consulta el paciente por su ID
            return em.find(Patient.class, idPatient);
        } catch (NoResultException e) {
            LOGGER.log(Level.INFO, "No se encontró ningún paciente con el ID especificado.");
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }

    @Override
    public Patient searchPatientByCurp(String curp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Patient> query = em.createQuery("SELECT p FROM Patient p WHERE p.curp = :curp", Patient.class);
            query.setParameter("curp", curp);
            return query.getSingleResult();
        } catch (NoResultException e) {
            LOGGER.log(Level.INFO, "No se encontró ningún paciente con el CURP especificado.");
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }

    public static Search getInstance() {
        return new Search() {
        };
    }

}
