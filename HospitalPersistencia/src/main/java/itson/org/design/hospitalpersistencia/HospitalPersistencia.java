package itson.org.design.hospitalpersistencia;

import JPAEntities.Patient;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import registration.IRegistrationDAO;
import registration.RegistrationDAO;

/**
 *
 * @author Laboratorios
 */
public class HospitalPersistencia {
    
    public static void main(String[] args) {
        /*
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
         */
        
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1990, Calendar.JANUARY, 1);

        // Create a Patient instance
        Patient patient = new Patient(
                "Jullian",
                "SeLa",
                "Come",
                birthDate,
                "Female",
                "CURP123",
                "1234567890",
                "123-456-7890",
                "Ave. Nida",
                "Col. On",
                12345
        );
        
        IRegistrationDAO registration = RegistrationDAO.getInstance();
        registration.registerPatient(patient);

        /*    em.getTransaction().begin();
         em.persist(patient);
        em.getTransaction().commit();
        em.close();
        emf.close();
         */
    }
}
