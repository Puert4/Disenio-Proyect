package user.system;

import JPAEntities.AdministratorEntity;
import JPAEntities.PatientEntity;
import JPAEntities.UserAdministrator;
import JPAEntities.UserEntity;
import JPAEntities.UserPatient;
import administrator.system.IAdministratorDAO;
import administrator.system.newAdministratorDTO;
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
    public void registerUser(NewUserDTO userDTO) {
        UserEntity user = DtoToEntity(userDTO);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    //aqui hice cambios de UserEntity a UserPatient
    @Override
    public UserEntity DtoToEntity(NewUserDTO userDTO) {
        IPatientDAO patientD = Factory.getPatientDAO();
        UserPatient user = new UserPatient();
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

    @Override
    public void registerAdminUser(newAdministratorDTO administratorDTO, NewUserDTO userDTO) {
        IAdministratorDAO administratorD = Factory.getAdministratorDAO();
        administratorD.DtoToEntity(administratorDTO);
        UserAdministrator user = new UserAdministrator();
        user.setUser(userDTO.getUser());
        user.setPassword(userDTO.getPassword());

        AdministratorEntity administrator = administratorD.searchAdministratorByName(userDTO.getAdministratorDTO().getName());
        user.setAdministrator(administrator);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

}
