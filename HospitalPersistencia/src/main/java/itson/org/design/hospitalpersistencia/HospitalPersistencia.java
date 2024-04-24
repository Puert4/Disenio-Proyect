package itson.org.design.hospitalpersistencia;

import JPAEntities.PatientEntity;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import patient.system.IPatientDAO;
import patient.system.NewPatientDTO;
import patient.system.PatientDAO;

/**
 *
 * @author Laboratorios
 */
public class HospitalPersistencia {

    public static void main(String[] args) {

        /*
        
        //Probando que guarde adecuadamente
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(2000, 06, 06);

        PatientEntity patient = new PatientEntity("Juan ",
                "Perez",
                "Gonzales",
                birthDate,
                "M",
                "AAAAAAAAAAA",
                "66498998",
                "64416441",
                "Pto. Cabos San Lucas",
                "Mexico",
                85900);

        em.persist(patient);
        em.getTransaction().commit();
        em.close();
        
         */
        //Usando los metodos para guardar
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1980, 04, 15);

        NewPatientDTO patientDTO = new NewPatientDTO(
                "Hector ",
                "Ester",
                "Nunez",
                birthDate,
                "M",
                "CCCCCCCCC",
                "312312",
                "64415346",
                "Pto. Topolobampo",
                "Mexico",
                85900);

        IPatientDAO patientDAO = PatientDAO.getInstance();
        patientDAO.registerPatient(patientDTO);

    }
}
