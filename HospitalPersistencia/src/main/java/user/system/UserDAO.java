package user.system;

import JPAEntities.PatientEntity;
import JPAEntities.UserEntity;
import control.Factory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import patient.system.IPatientDAO;

/**
 *
 * @author TeLesheo
 */
public class UserDAO implements IUserDAO {

    private UserDAO() {
    }

    @Override
    public void registerUser(UserDTO userDTO) {
        UserEntity user = DtoToEntity(userDTO);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public UserEntity DtoToEntity(UserDTO userDTO) {
        IPatientDAO patientD = Factory.getPatientDAO();
        UserEntity user = new UserEntity();
        user.setUser(userDTO.getUser());
        user.setPassword(userDTO.getPassword());
        PatientEntity patient = patientD.searchPatientByCurp(userDTO.getPatientDTO().getCurp());
        user.setPatient(patient);

        return user;
    }

    public static UserDAO getInstance() {
        return new UserDAO() {
        };
    }
}
