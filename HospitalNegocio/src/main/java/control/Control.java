package control;

import JPAEntities.Patient;
import dtos.NewPatientDTO;
import loginManager.ILogIn;
import loginManager.LogIn;
import registration.IRegistrationDAO;
import registration.RegistrationDAO;

/**
 *
 * @author TeLesheo
 */
public abstract class Control implements IControl {

    private Control() {
    }

    /**
     *
     * @param newPatient
     */
    @Override
    public void addNewPatient(NewPatientDTO newPatient) {
        IRegistrationDAO registration = RegistrationDAO.getInstance();
        Patient patient = new Patient();
        patient.setNames(newPatient.getNames());
        patient.setFirstName(newPatient.getFirstName());
        patient.setSecondName(newPatient.getSecondName());
        patient.setCurp(newPatient.getCurp());
        patient.setPhone(newPatient.getPhone());
        patient.setBirthDate(newPatient.getBirthDate());
        patient.setSex(newPatient.getSex());
        patient.setStreet(newPatient.getStreet());
        patient.setZipCode(newPatient.getZipCode());
        patient.setColony(newPatient.getColony());
        patient.setSocialNumber(newPatient.getSocialNumber());

        registration.registerPatient(patient);
    }

    @Override
    public Long verifyUser(String user, String password) {
        ILogIn login = LogIn.getInstance();
        Long patientId = login.validateUser(user, password);
        return patientId;

    }

    public static Control getInstance() {
        return new Control() {
        };
    }

}
