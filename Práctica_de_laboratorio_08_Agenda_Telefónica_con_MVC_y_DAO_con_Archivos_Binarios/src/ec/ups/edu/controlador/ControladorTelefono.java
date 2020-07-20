/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.dao.TelefonoDAO;
import ec.ups.edu.idao.ITelefonoDAO;
import ec.ups.edu.modelo.Telefono;

/**
 *
 * @author JHON FAREZ
 */
public class ControladorTelefono {
    
    //objetos vist
    private Telefono telefono;
    private TelefonoDAO telefonoDAO;

    // constructor
    public ControladorTelefono(TelefonoDAO telefonoDAO) {
       
        this.telefonoDAO = telefonoDAO;
    }
    
    public void crearTelefono(Telefono telefono){
        telefonoDAO.create(telefono);
    }
    
    public Telefono encontrarTelefono(int codigo){
        
        telefono = telefonoDAO.read(codigo);
        
        return telefono;
    }
    
    
}
