/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package connection;

import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Laboratorios
 */
public interface IConnectionDB {
    
    public EntityManagerFactory createConnection();
    
}
