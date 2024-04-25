package user.system;

import JPAEntities.UserEntity;

/**
 *
 * @author TeLesheo
 */
public interface IUserDAO {

    public void registerUser(UserDTO userDTO);

    public UserEntity DtoToEntity(UserDTO userDTO);

}
