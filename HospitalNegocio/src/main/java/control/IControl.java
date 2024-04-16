package control;

import dtos.NewPatientDTO;

/**
 *
 * @author TeLesheo
 */
public interface IControl {

    public void addNewPatient(NewPatientDTO newPatient);

    public boolean verifyUser(String user, String password);
}
