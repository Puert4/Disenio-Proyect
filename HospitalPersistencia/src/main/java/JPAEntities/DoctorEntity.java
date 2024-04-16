package JPAEntities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author TeLesheo
 */
@Entity
@Table(name = "DoctorEntity")
public class DoctorEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "names", nullable = false)
    private String names;

    @Column(name = "firstLastName", nullable = false)
    private String firstLastName;

    @Column(name = "secondLastName", nullable = false)
    private String secondLastName;

    @Column(name = "specialization", nullable = false)
    private String specialization;

    @Column(name = "medicalCart", nullable = false)
    private String medicalCart;

    /**
     *
     */
    public DoctorEntity() {

    }

    /**
     *
     * @param names
     * @param firstLastName
     * @param secondLastName
     * @param specialization
     * @param medicalCart
     */
    public DoctorEntity(String names, String firstLastName, String secondLastName, String specialization, String medicalCart) {
        this.names = names;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.specialization = specialization;
        this.medicalCart = medicalCart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getMedicalCart() {
        return medicalCart;
    }

    public void setMedicalCart(String medicalCart) {
        this.medicalCart = medicalCart;
    }

}