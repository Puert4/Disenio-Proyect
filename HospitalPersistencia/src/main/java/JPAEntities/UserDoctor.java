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
@Table(name = "UserDoctor")
@Inheritance(strategy = InheritanceType.JOINED)
public class UserDoctor extends UserEntity implements Serializable {

    @OneToOne
    private DoctorEntity doctor;

    public UserDoctor() {
    }

    public UserDoctor(DoctorEntity doctor) {
        this.doctor = doctor;
    }

    public UserDoctor(DoctorEntity doctor, Long id, String user, String password) {
        super(id, user, password);
        this.doctor = doctor;
    }

    public DoctorEntity getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorEntity doctor) {
        this.doctor = doctor;
    }

}
