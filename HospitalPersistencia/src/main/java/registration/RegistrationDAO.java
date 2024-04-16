/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;

import JPAEntities.Administrator;
import JPAEntities.Appointment;
import JPAEntities.Doctor;
import JPAEntities.Patient;
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
    public void registerPatient(Patient patient) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(patient);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    @Override
    public void registerDoctor(Doctor doctor) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(doctor);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public void registerAdministrator(Administrator administrator) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(administrator);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public void registerAppointment(Appointment appointment) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(appointment);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static RegistrationDAO getInstance() {
        return new RegistrationDAO() {
        };

    }

}
