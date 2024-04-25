package doctor.system;

import JPAEntities.DoctorEntity;

/**
 *
 * @author TeLesheo
 */
public interface IDoctorDAO {

    public void registerDoctor(NewDoctorDTO doctorDTO);

    public DoctorEntity DtoToEntity(NewDoctorDTO doctorDTO);

    public DoctorEntity serachById(Long idDoctor);

    public DoctorEntity searchByMedicart(String medicart);
}
