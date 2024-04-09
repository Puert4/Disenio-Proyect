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
public class ExistentCiteDTO {
    private Long id;
    private ExistentDoctorDTO doctor;
    private ExistentPatientDTO patient;
    private Calendar citeDate;
    private int status;

    public ExistentCiteDTO() {
    }

    public ExistentCiteDTO(Long id, ExistentDoctorDTO doctor, ExistentPatientDTO patient, Calendar citeDate, int status) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.citeDate = citeDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExistentDoctorDTO getDoctor() {
        return doctor;
    }

    public void setDoctor(ExistentDoctorDTO doctor) {
        this.doctor = doctor;
    }

    public ExistentPatientDTO getPatient() {
        return patient;
    }

    public void setPatient(ExistentPatientDTO patient) {
        this.patient = patient;
    }

    public Calendar getCiteDate() {
        return citeDate;
    }

    public void setCiteDate(Calendar citeDate) {
        this.citeDate = citeDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
