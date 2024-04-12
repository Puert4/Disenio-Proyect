package JPAEntities;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author TeLesheo
 */
@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "names")
    private String names;

    @Column(name = "firsttName")
    private String firsttName;

    @Column(name = "secondName")
    private String secondName;

    @Column(name = "birthDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar birthDate;

    @Column(name = "sex")
    private String sex;

    @Column(name = "curp")
    private String curp;

    @Column(name = "socialNumber")
    private String socialNumber;

    @Column(name = "phone")
    private String phone;

    @Column(name = "street")
    private String street;

    @Column(name = "colony")
    private String colony;

    @Column(name = "zip_code")
    private int zipCode;

    public Patient() {
    }

    public Patient(String names, String firsttName, String secondName, Calendar birthDate, String sex, String curp, String socialNumber, String phone, String street, String colony, int zipCode) {
        this.names = names;
        this.firsttName = firsttName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.sex = sex;
        this.curp = curp;
        this.socialNumber = socialNumber;
        this.phone = phone;
        this.street = street;
        this.colony = colony;
        this.zipCode = zipCode;
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

    public String getFirsttName() {
        return firsttName;
    }

    public void setFirsttName(String firsttName) {
        this.firsttName = firsttName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

}
