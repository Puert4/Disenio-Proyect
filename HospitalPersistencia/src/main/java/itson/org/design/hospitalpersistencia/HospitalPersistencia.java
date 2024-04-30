package itson.org.design.hospitalpersistencia;

import JPAEntities.DoctorEntity;
import JPAEntities.PatientEntity;
import JPAEntities.Specialization;
import administrator.system.IAdministratorDAO;
import administrator.system.newAdministratorDTO;
import appointment.system.AppointmentStatus;
import appointment.system.IAppointmentManager;
import appointment.system.NewAppointmentDTO;
import doctor.system.DoctorDAO;
import doctor.system.ExistentDoctorDTO;
import doctor.system.IDoctorDAO;
import doctor.system.NewDoctorDTO;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import patient.system.ExistentPatientDTO;
import patient.system.IPatientDAO;
import patient.system.NewPatientDTO;
import patient.system.PatientDAO;
import user.system.IUserDAO;
import user.system.UserDAO;
import user.system.NewUserDTO;

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
        birthDate.set(2002, 06, 06);

        PatientEntity patient = new PatientEntity("Gabino ",
                "Pom",
                "Gerac",
                birthDate,
                "M",
                "IIIII",
                "66789417",
                "644168",
                "Pto. Cabos San Lucas",
                "Oeste",
                85900);

        em.persist(patient);
        em.getTransaction().commit();
        em.close();
         */
        // Agrega Persona y Usuario
        /*
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1980, 04, 15);

        NewPatientDTO patientDTO = new NewPatientDTO(
                "Teresa ",
                "Vazquez",
                "Montoya",
                birthDate,
                "M",
                "EEEEEE",
                "984841",
                "66475126",
                "Nuevo Leon",
                "Centro",
                85900);

        IPatientDAO patientDAO = PatientDAO.getInstance();
        patientDAO.registerPatient(patientDTO);

        NewUserDTO userDTO = new NewUserDTO();
        userDTO.setPassword("PANA");
        userDTO.setUser("pana");
        userDTO.setPatientDTO(patientDTO);

        IUserDAO userDAO = UserDAO.getInstance();
        userDAO.registerUser(userDTO);
         */
 /*
        
        //Agregar Doctor
        NewDoctorDTO doctorDTO = new NewDoctorDTO(
                "Carlos",
                "Perez",
                "Lopez",
                "Cardiologia",
                "1231312"
        );

        
        
        IDoctorDAO doctorDAO = DoctorDAO.getInstance();
        doctorDAO.registerDoctor(doctorDTO);
         */
 /*
        IPatientDAO patientD = Factory.getPatientDAO();
        PatientEntity patient = patientD.searchPatientByCurp("DDDDD");

        ExistentPatientDTO patientDTO = new ExistentPatientDTO();
        patientDTO = patientD.EntityToDto(patient);

        IDoctorDAO doctorD = Factory.getDoctorDAO();
        String medicart = "1231312";
        DoctorEntity doctor = doctorD.searchByMedicart(medicart);

        /*
        DoctorEntity doctor = doctorD.serachById(Long.MIN_VALUE);
         */
 /*
        ExistentDoctorDTO doctorDTO = new ExistentDoctorDTO();
        doctorDTO.setId(doctor.getId());
        doctorDTO.setFirstName(doctor.getNames());
        doctorDTO.setFirstName(doctor.getFirstLastName());
        doctorDTO.setSecondName(doctor.getSecondLastName());
        doctorDTO.setMedicalCart(doctor.getMedicalCart());

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1980, 04, 15);

        NewAppointmentDTO appointment = new NewAppointmentDTO(
                doctorDTO,
                patientDTO,
                birthDate,
                AppointmentStatus.ACTIVE
        );

        IAppointmentManager appointmentManager = Factory.getAppointmentManager();

        appointmentManager.createAppointment(appointment);
         */
//        newAdministratorDTO administrator = new newAdministratorDTO();
//        administrator.setName("Jullian");
//
//        IAdministratorDAO admin = Factory.getAdministratorDAO();
//        admin.registerAdministrator(administrator);
//
//        IUserDAO user = Factory.getUserDAO();
//
//        NewUserDTO newUserDTO = new NewUserDTO("Jullian", "Jullian", administrator);
//        user.registerAdminUser(administrator, newUserDTO);

    }
}
