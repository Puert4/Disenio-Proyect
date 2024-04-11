package JPAEntities;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author TeLesheo
 */
@Entity
public class Doctor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "names")
    private String names;

    @Column(name = "firstLastName")
    private String firstLastName;

    @Column(name = "secondLastName")
    private String secondLastName;

    @Column(name = "dateOfBirth")
    private Calendar dateOfBirth;

    @Column(name = "sex")
    private String sex;

    @Column(name = "curp")
    private String curp;

    @Column(name = "socialSecurityNumber")
    private String socialSecurityNumber;

    @Column(name = "phone")
    private String phone;
    
    

}
