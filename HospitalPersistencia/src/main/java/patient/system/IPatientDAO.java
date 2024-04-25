package patient.system;

import JPAEntities.PatientEntity;

/**
 *
 * @author TeLesheo
 */
public interface IPatientDAO {

    public void registerPatient(NewPatientDTO newPatient);

    /*
    public PatientEntity serachPatientById(Long idPatient);
     */
    public PatientEntity searchPatientByCurp(String curp);

    public ExistentPatientDTO EntityToDto(PatientEntity patient);

    public PatientEntity DtoToEntity(NewPatientDTO newPatientDTO);

}
