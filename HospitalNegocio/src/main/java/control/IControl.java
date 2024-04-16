package control;

import JPAEntities.Patient;
import dtos.ExistentPatientDTO;
import dtos.NewPatientDTO;
import dtos.UserDTO;

/**
 *
 * @author TeLesheo
 */
public interface IControl {

    public void addNewPatient(NewPatientDTO newPatient);

    public Long verifyUser(String user, String password);

    public ExistentPatientDTO getPatientByID(Long idPatient);

    public ExistentPatientDTO convertPatientToExistent(Patient patient);

    public void addNewUser(UserDTO newUser);

    public Patient getPatientByCurp(String curp);
}
