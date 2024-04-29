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

    public void registerAdminUser(newAdministratorDTO administratorDTO, NewUserDTO userDTO);

    public String getUserType(Long userId);

    public Long validateUser(String user, String password);

    public String getUserTypeByUserAndPassword(String user, String password);

}
