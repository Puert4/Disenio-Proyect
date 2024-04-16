package searches;

import JPAEntities.PatientEntity;

/**
 *
 * @author TeLesheo
 */
public interface ISearch {

    public PatientEntity serachPatientById(Long idPatient);

    public PatientEntity searchPatientByCurp(String curp);

}
