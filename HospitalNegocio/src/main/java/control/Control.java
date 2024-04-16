package control;

import JPAEntities.Patient;
import JPAEntities.User;
import dtos.ExistentPatientDTO;
import dtos.NewPatientDTO;
import dtos.UserDTO;
import loginManager.ILogIn;
import loginManager.LogIn;
import registration.IRegistrationDAO;
import registration.RegistrationDAO;
import searches.ISearch;
import searches.Search;

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
    public void addNewUser(UserDTO newUser) {
        IRegistrationDAO registration = RegistrationDAO.getInstance();

        User user = new User();
        user.setUser(newUser.getUser());
        user.setPassword(newUser.getPassword());
        user.setPatient(getPatientByCurp(newUser.getPatientDTO().getCurp()));
        registration.registerUser(user);
    }

    @Override
    public Patient getPatientByCurp(String curp) {
        ISearch search = Search.getInstance();
        return search.searchPatientByCurp(curp);

    }

    @Override
    public Long verifyUser(String user, String password) {
        ILogIn login = LogIn.getInstance();
        Long patientId = login.validateUser(user, password);
        return patientId;

    }

    @Override
    public ExistentPatientDTO getPatientByID(Long idPatient) {
        ISearch search = Search.getInstance();
        return convertPatientToExistent(search.serachPatientById(idPatient));

//        Patient patient = search.serachPatientById(idPatient);
//        return patient;
    }

    @Override
    public ExistentPatientDTO convertPatientToExistent(Patient patient) {
        ExistentPatientDTO existentPatientDTO = new ExistentPatientDTO();
        existentPatientDTO.setId(patient.getId());
        existentPatientDTO.setName(patient.getNames());
        existentPatientDTO.setFirstName(patient.getFirstName());
        existentPatientDTO.setSecondName(patient.getSecondName());
        existentPatientDTO.setCurp(patient.getCurp());
        existentPatientDTO.setPhone(patient.getPhone());
        existentPatientDTO.setBirthDate(patient.getBirthDate());
        existentPatientDTO.setSex(patient.getSex());
        existentPatientDTO.setStreet(patient.getStreet());
        existentPatientDTO.setZipCode(patient.getZipCode());
        existentPatientDTO.setColonia(patient.getColony());
        existentPatientDTO.setSocialNumber(patient.getSocialNumber());

        return existentPatientDTO;
    }

    public static Control getInstance() {
        return new Control() {
        };
    }

}
