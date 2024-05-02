package appointment.system;

import JPAEntities.AppointmentEntity;
import JPAEntities.DoctorEntity;
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
   
}
