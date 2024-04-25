package appointment.system;

import doctor.system.ExistentDoctorDTO;
import java.util.Calendar;
import patient.system.ExistentPatientDTO;

/**
 *
 * @author TeLesheo
 */
public class ExistentAppointmentDTO {

    private Long id;
    private ExistentDoctorDTO doctor;
    private ExistentPatientDTO patient;
    private Calendar appointmentDate;
    private AppointmentStatus status;

    public ExistentAppointmentDTO() {
    }

    public ExistentAppointmentDTO(Long id, ExistentDoctorDTO doctor, ExistentPatientDTO patient, Calendar appointmentDate, AppointmentStatus status) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExistentDoctorDTO getDoctor() {
        return doctor;
    }

    public void setDoctor(ExistentDoctorDTO doctor) {
        this.doctor = doctor;
    }

    public ExistentPatientDTO getPatient() {
        return patient;
    }

    public void setPatient(ExistentPatientDTO patient) {
        this.patient = patient;
    }

    public Calendar getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Calendar appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

}
