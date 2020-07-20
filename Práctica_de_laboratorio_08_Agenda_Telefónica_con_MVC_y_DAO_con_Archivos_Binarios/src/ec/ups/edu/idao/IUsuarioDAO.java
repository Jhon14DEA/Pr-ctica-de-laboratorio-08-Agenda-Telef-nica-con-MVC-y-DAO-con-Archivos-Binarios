/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.idao;

import ec.ups.edu.modelo.Usuario;
import java.util.Map;

/**
 *
 * @author JHON FAREZ
 */
public interface IUsuarioDAO {

   
    public void create(Usuario usuario);

    
    public Usuario read(String cedula);
    
    public Usuario readCorreo(String correo);

    
    public void update(Usuario usuario);

    
    public void delete(Usuario usuario);

    
    public Usuario iniciarSesion(String correo, String contraseña);

    
    public Map<String, Usuario> findAll();
    
    public String llenarEspacios(int espacios);
}
