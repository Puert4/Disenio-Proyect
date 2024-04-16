/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;

import JPAEntities.Patient;

/**
 *
 * @author TeLesheo
 */
public abstract class Registration implements IRegistrationDAO {

    private Registration() {
        // Constructor privado para evitar la instanciación directa
    }

    @Override
    public void registerPatient(Patient patient) {

    }

    public static Registration getInstance() {
        return new Registration() {
        };

    }

}
