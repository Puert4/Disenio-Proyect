/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Laboratorios
 */
public class ConnectionDB implements IConnectionDB{
    
    private EntityManagerFactory emf;
    
    public ConnectionDB(){
        
        emf = Persistence.createEntityManagerFactory("connectionPU");
        
    }
    
    @Override
    public EntityManagerFactory createConnection(){
        
        return emf;
        
    }
    
}
