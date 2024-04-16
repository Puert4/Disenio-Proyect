package appointmentManager;

import JPAEntities.Appointment;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author TeLesheo
 */
public abstract class AppointmentManager implements IAppointmentManager {

    private AppointmentManager() {
    }

    @Override
    public void createAppointment(Appointment appointment) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(appointment);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static AppointmentManager getInstance() {
        return new AppointmentManager() {
        };
    }

}
