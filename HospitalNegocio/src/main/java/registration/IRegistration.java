package registration;

import dtos.NewPatientDTO;

/**
 *
 * @author TeLesheo
 */
public abstract interface IRegistration {

    public void registerPatient(NewPatientDTO patientDTO);

}
