package JPAEntities;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author TeLesheo
 */
@Entity
public class Appointment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_doctor")
    private Doctor doctor;

    @Column(name = "id_patient")
    private Patient patient;

    @Column(name = "appointment_date")
    private Calendar appointmentDate;

    @Column(name = "apponitment_state")
    private AppointmentState AppointmentState;

    public Appointment() {
    }

    public Appointment(Doctor doctor, Patient patient, Calendar appointmentDate, AppointmentState AppointmentState) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
        this.AppointmentState = AppointmentState;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Calendar getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Calendar appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public AppointmentState getAppointmentState() {
        return AppointmentState;
    }

    public void setAppointmentState(AppointmentState AppointmentState) {
        this.AppointmentState = AppointmentState;
    }

}
