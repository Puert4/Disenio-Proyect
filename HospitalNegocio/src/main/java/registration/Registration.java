/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;

import dtos.NewPatientDTO;

/**
 *
 * @author TeLesheo
 */
public class Registration implements IRegistration {

    @Override
    public void registerPatient(NewPatientDTO patientDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Registration getInstance() {
        return new Registration();
    }

}
