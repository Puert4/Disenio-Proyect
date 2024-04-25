package control;

import JPAEntities.PatientEntity;
import dtos.SpecializationD;
import dtos.UserDTO;
import patient.system.ExistentPatientDTO;
import patient.system.NewPatientDTO;

/**
 *
 * @author TeLesheo
 */
public interface IControl {

    public String encrypt(String text, int code);

    public String decrypt(String text, int code);

    public void addNewPatient(NewPatientDTO newPatient);

    public Long verifyUser(String user, String password);

    public ExistentPatientDTO convertPatientToExistent(PatientEntity patient);

    public PatientEntity findByCurp(String curp);

    public ExistentPatientDTO findById(Long id);

    public void addNewUser(UserDTO newUser);

    public SpecializationD fromString(String text);

}
