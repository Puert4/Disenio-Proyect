package user.system;

import JPAEntities.UserEntity;
import administrator.system.newAdministratorDTO;

/**
 *
 * @author TeLesheo
 */
public interface IUserDAO {

    public void registerUser(NewUserDTO userDTO);

    public UserEntity DtoToEntity(NewUserDTO userDTO);

    public void registerAdminUser(newAdministratorDTO administratorDTO,NewUserDTO userDTO);

}
