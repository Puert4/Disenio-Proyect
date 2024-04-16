package registration;

import JPAEntities.AdministratorEntity;
import JPAEntities.AppointmentEntity;
import JPAEntities.DoctorEntity;
import JPAEntities.PatientEntity;
import JPAEntities.UserEntity;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author TeLesheo
 */
public abstract class RegistrationDAO implements IRegistrationDAO {

    private RegistrationDAO() {
        // Constructor privado para evitar la instanciación directa
    }

    @Override
    public void registerPatient(PatientEntity patient) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(patient);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    @Override
    public void registerDoctor(DoctorEntity doctor) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(doctor);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public void registerAdministrator(AdministratorEntity administrator) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(administrator);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public void registerAppointment(AppointmentEntity appointment) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(appointment);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public void registerUser(UserEntity user) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static RegistrationDAO getInstance() {
        return new RegistrationDAO() {
        };

    }

}
