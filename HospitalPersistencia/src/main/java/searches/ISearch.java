package searches;

import JPAEntities.Patient;

/**
 *
 * @author TeLesheo
 */
public interface ISearch {

    public Patient serachPatientById(Long idPatient);

    public Patient searchPatientByCurp(String curp);

}
