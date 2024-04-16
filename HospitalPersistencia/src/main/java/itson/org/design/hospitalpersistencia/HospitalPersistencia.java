package itson.org.design.hospitalpersistencia;

import JPAEntities.Appointment;
import JPAEntities.AppointmentState;
import JPAEntities.Doctor;
import JPAEntities.Patient;
import JPAEntities.User;
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
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
//        EntityManager em = emf.createEntityManager();
//
//        Calendar birthDate = Calendar.getInstance();
//        birthDate.set(1990, Calendar.JANUARY, 1);
//
//        Calendar appointmentDate = Calendar.getInstance();
//        appointmentDate.set(2024, Calendar.JUNE, 1);
//
//        AppointmentState appointmentState = AppointmentState.ACTIVE;
//        
//        User user = new User();
//
//        // Create a Patient instance
//        Patient patient = new Patient(
//                "AAAAAAAA",
//                "AAAAAA",
//                "AAAAA",
//                birthDate,
//                "Female",
//                "CURP123",
//                "1234567890",
//                "123-456-7890",
//                "Ave. Nida",
//                "Col. On",
//                12345
//        );

//        Doctor doctor = new Doctor(
//                "BBBBBB",
//                "BBBBBBB",
//                "BBBBBB",
//                "Familiar",
//                "AAAAA"
//        );
//        Appointment appointment = new Appointment(
//                doctor,
//                patient,
//                appointmentDate,
//                appointmentState
//        );
//        IRegistrationDAO registration = RegistrationDAO.getInstance();
//        registration.registerDoctor(doctor);
//        registration.registerPatient(patient);
//        registration.registerAppointment(appointment);
//        em.getTransaction().begin();
//      em.persist(doctor);
//        em.persist(patient);
//
//        em.persist(appointment);
//        em.getTransaction().commit();
//        em.close();
//        emf.close();
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
//        EntityManager em = emf.createEntityManager();
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1990, Calendar.JANUARY, 1);
//
//        try {
//            em.getTransaction().begin();

            // Create a new User
            // Create a new Patient
            Patient patient = new Patient("AAAAAAAA",
                    "AAAAAA",
                    "AAAAA",
                    birthDate,
                    "Female",
                    "CURP123",
                    "1234567890",
                    "123-456-7890",
                    "Ave. Nida",
                    "Col. On",
                    12345
            );
            User user = new User("username", "password", patient);
            
            IRegistrationDAO register = RegistrationDAO.getInstance();
            register.registerPatient(patient);
            register.registerUser(user);

//            // Set the relationship between User and Patient
//            // Persist both User and Patient
//            em.persist(user);
//            em.persist(patient);
//
//            em.getTransaction().commit();
//            System.out.println("User and Patient added successfully!");
//        } catch (Exception e) {
//            if (em.getTransaction() != null && em.getTransaction().isActive()) {
//                em.getTransaction().rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }

    }
}
