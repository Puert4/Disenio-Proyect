package JPAEntities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author TeLesheo
 */
@Entity
@Table(name = "UserAdministrator")
@Inheritance(strategy = InheritanceType.JOINED)
public class UserAdministrator extends UserEntity implements Serializable {

    @OneToOne
    private AdministratorEntity administrator;

    public UserAdministrator() {
    }

    public UserAdministrator(AdministratorEntity administrator) {
        this.administrator = administrator;
    }

    public UserAdministrator(AdministratorEntity administrator, Long id, String user, String password) {
        super(id, user, password);
        this.administrator = administrator;
    }

    public AdministratorEntity getAdministrator() {
        return administrator;
    }

    public void setAdministrator(AdministratorEntity administrator) {
        this.administrator = administrator;
    }





}
