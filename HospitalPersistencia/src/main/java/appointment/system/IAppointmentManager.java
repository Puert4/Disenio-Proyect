package appointment.system;

import JPAEntities.AppointmentEntity;
import JPAEntities.DoctorEntity;
import JPAEntities.PatientEntity;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author TeLesheo
 */
public interface IAppointmentManager {

    public void createAppointment(NewAppointmentDTO newAppointmentDTO);

    public AppointmentEntity DtoToEntity(NewAppointmentDTO newAppointmentDTO);

    public List<Calendar> findLimitDays(DoctorEntity doctorEntity);

    // public List<AppointmentEntity> findAppointmentsByPatientId(Long patientId);
    public List<ExistentAppointmentDTO> findAppointmentsByPatientId(Long patientId);

    public ExistentAppointmentDTO convertToDTO(AppointmentEntity appointmentEntity);

    public boolean cancelAppointment(Long appointmentId);

}
