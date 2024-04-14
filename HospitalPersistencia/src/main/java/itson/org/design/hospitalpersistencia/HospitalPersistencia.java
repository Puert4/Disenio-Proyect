package itson.org.design.hospitalpersistencia;

import JPAEntities.Patient;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Laboratorios
 */
public class HospitalPersistencia {

    public static void main(String[] args) {

        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1990, Calendar.JANUARY, 1);

        // Create a Patient instance
        Patient patient = new Patient(
                "Amos",
                "Zingas",
                ".",
                birthDate,
                "Female",
                "CURP12345",
                "1234567890",
                "123-456-7890",
                "Ave. Nida",
                "Col. On",
                12345
        );

        em.getTransaction().begin();
         em.persist(patient);
        em.getTransaction().commit();
        em.close();
        emf.close();
         
    }
}
