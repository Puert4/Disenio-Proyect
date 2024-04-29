package user.system;

import JPAEntities.UserEntity;

/**
 *
 * @author TeLesheo
 */
public interface IUserDAO {

    public void registerUser(NewUserDTO userDTO);

    public UserEntity DtoToEntity(NewUserDTO userDTO);

}
