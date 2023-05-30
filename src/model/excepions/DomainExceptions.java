/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.excepions;

/**
 *
 * @author Cert
 */
public class DomainExceptions extends RuntimeException{
    
    private static final long serialVesionUID = 1L;
    
    public DomainExceptions(String msg){
        super(msg);
    }
    
    
}
