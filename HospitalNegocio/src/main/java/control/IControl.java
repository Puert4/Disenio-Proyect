package control;

import dtos.NewPatientDTO;

/**
 *
 * @author TeLesheo
 */
public interface IControl {

    public void addNewPatient(NewPatientDTO newPatient);

    public Long verifyUser(String user, String password);
}
