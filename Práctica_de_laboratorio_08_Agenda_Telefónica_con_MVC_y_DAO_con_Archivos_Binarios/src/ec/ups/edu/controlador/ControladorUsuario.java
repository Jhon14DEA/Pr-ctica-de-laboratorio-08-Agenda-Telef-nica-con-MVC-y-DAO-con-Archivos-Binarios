/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.dao.TelefonoDAO;
import ec.ups.edu.dao.UsuarioDAO;
import ec.ups.edu.idao.ITelefonoDAO;
import ec.ups.edu.idao.IUsuarioDAO;
import ec.ups.edu.modelo.Telefono;
import ec.ups.edu.modelo.Usuario;
import ec.ups.edu.vista.VtnaInicioSesion;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JHON FAREZ
 */
public class ControladorUsuario {

    private int contadorTelefono;

    //objetos vista
    private VtnaInicioSesion vista;
    //objetos modelo
    private Usuario usuario;
    private Telefono telefono;
    //objetos DAO
    private IUsuarioDAO usuarioDAO;
    private ITelefonoDAO telefonoDAO;

    public ControladorUsuario(UsuarioDAO clienteDAO, TelefonoDAO direccionDAO) {
        //   this.vista = vistaCliente;
        this.usuarioDAO = clienteDAO;

        // this.vistaT = vistaDireccion;
        this.telefonoDAO = direccionDAO;

        contadorTelefono = 0;

    }

    public void crearUsuario(String nombre, String apellido, String cedula, String correo,
            String password) {

        usuario = new Usuario();

        usuario.setCedula(cedula);
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setContraseña(password);
        System.out.println(usuario.toString());
        usuarioDAO.create(usuario);
    }

    public Usuario iniciarSesion(String correo, String password) {

        //se obtienen los datos de contraseÃ±a y correo
        //se envian los datos y se recibe una persona
        usuario = usuarioDAO.iniciarSesion(correo, password);
        return usuario;
    }

    public Usuario devolverUsuario() {
        return usuario;
    }

    public void actualizarUsuario(String nombre, String apellido, String cedula, String correo,
            String password) {
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setContraseña(password);
        usuario.setCedula(cedula);

        usuarioDAO.update(usuario);

    }

    public void imprimirTelefonos() {
        List<Telefono> telefonos;
        telefonos = telefonoDAO.findAll();

        for (Telefono tele : telefonos) {
            System.out.println(tele.toString());
        }
    }

    public void imprimirUsuario(Usuario usuario) {
        System.out.println(usuario);
    }

    public void imprimirUsuarios() {
        Map<String, Usuario> usuarios;
        usuarios = usuarioDAO.findAll();

    }

    public Usuario buscar(String id) {
        usuario = usuarioDAO.read(id);
        if (usuario == null) {
            return null;
        } else {
            return usuario;
        }

    }

    public Usuario buscarCorreo(String correo) {
        usuario = usuarioDAO.readCorreo(correo);
        if (usuario == null) {
            return null;
        } else {
            return usuario;
        }

    }

    public void agregarTelefono(int codigo, String numero, String tipo, String operadora) {

        telefono = new Telefono(codigo, numero, tipo, operadora);
        telefono.setUsuario(usuario);
        telefonoDAO.create(telefono);
    }

    public void actualizarTelefono(String numero, String tipo, String operadora, int codigo) {

        telefono = new Telefono(codigo, numero, tipo, operadora);
        telefonoDAO.update(telefono);

    }

    public String buscarTelefono(int codigo) {
        telefono = telefonoDAO.read(codigo);
        if (telefono != null) {
            return telefono.toString();
        } else {
            return "";
        }

    }

    public void eliminarTelefono(int codigo) {

        telefonoDAO.delete(codigo);

    }

    public List<Telefono> listarTelefonosUsuario() {
        String id = usuario.getCedula().trim();

        return telefonoDAO.telefonosUsuario(id);
    }

    public List<Telefono> listarTelefonosVentana(String id) {

        return telefonoDAO.telefonosUsuario(id);
    }

    public List<Telefono> listarTodos() {
        return telefonoDAO.findAll();
    }

    public int codigoTelefono() {
        int conta = telefonoDAO.codigoTelefono();
        return (++conta);
    }

}
