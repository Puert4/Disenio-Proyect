package appointment.system;

import JPAEntities.AppointmentEntity;
import JPAEntities.DoctorEntity;

/**
 *
 * @author TeLesheo
 */
public interface IAppointmentManager {

    public void createAppointment(NewAppointmentDTO newAppointmentDTO);

    public AppointmentEntity DtoToEntity(NewAppointmentDTO newAppointmentDTO);

   
}
