package registration;

import JPAEntities.AdministratorEntity;
import JPAEntities.AppointmentEntity;
import JPAEntities.DoctorEntity;
import JPAEntities.PatientEntity;
import JPAEntities.UserEntity;

/**
 *
 * @author TeLesheo
 */
public interface IRegistrationDAO {

    public void registerPatient(PatientEntity patient);

    public void registerDoctor(DoctorEntity doctor);

    public void registerAdministrator(AdministratorEntity administrator);

    public void registerAppointment(AppointmentEntity appointment);

    public void registerUser(UserEntity user);
}
