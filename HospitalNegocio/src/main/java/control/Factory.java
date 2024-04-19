package control;

import patient.system.IPatientDAO;
import patient.system.PatientDAO;

/**
 *
 * @author TeLesheo
 */
public class Factory {

    private static IPatientDAO patientDAO;

    public static IPatientDAO getRegistrationDAO() {
        return patientDAO == null ? (patientDAO = PatientDAO.getInstance()) : patientDAO;
    }
}
