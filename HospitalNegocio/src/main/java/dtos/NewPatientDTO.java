/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.util.Calendar;

/**
 *
 * @author Laboratorios
 */
public class NewPatientDTO {
    private String name;
    private String firstName;
    private String secondName;
    private String curp;
    private String phone;
    private Calendar birthDate;
    private String sex;
    private String street;
    private String postalNumber;
    private String colonia;
    private String socialNumber;

    public NewPatientDTO() {
    }

    public NewPatientDTO(String name, String firstName, String secondName, String curp, String phone, Calendar birthDate, String sex, String street, String postalNumber, String colonia, String socialNumber) {
        this.name = name;
        this.firstName = firstName;
        this.secondName = secondName;
        this.curp = curp;
        this.phone = phone;
        this.birthDate = birthDate;
        this.sex = sex;
        this.street = street;
        this.postalNumber = postalNumber;
        this.colonia = colonia;
        this.socialNumber = socialNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalNumber() {
        return postalNumber;
    }

    public void setPostalNumber(String postalNumber) {
        this.postalNumber = postalNumber;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }
}
