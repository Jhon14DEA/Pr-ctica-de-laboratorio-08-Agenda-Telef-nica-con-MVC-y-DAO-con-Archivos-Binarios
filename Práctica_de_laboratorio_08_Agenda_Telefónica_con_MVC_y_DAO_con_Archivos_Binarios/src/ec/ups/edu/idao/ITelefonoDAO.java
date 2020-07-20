/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.idao;

import ec.ups.edu.modelo.Telefono;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JHON FAREZ
 */
public interface ITelefonoDAO {

   
    public void create(Telefono telefono);

   
    public Telefono read(int id);

    
    public void update(Telefono telefono);

    
    public void delete(int id);

   
    public List<Telefono> findAll();

    public List<Telefono> telefonosUsuario(String id);

    public int codigoTelefono();
    
    public String llenarEspacios(int espacios);

}
