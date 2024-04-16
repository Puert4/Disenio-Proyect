package registration;

import JPAEntities.Administrator;
import JPAEntities.Appointment;
import JPAEntities.Doctor;
import JPAEntities.Patient;

/**
 *
 * @author TeLesheo
 */
public interface IRegistrationDAO {

    public void registerPatient(Patient patient);

    public void registerDoctor(Doctor doctor);

    public void registerAdministrator(Administrator administrator);
    
    public void registerAppointment(Appointment appointment);
}
