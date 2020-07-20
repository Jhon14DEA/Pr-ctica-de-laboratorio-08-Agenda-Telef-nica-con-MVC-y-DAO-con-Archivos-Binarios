/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

/**
 *
 * @author JHON FAREZ
 */
public class Usuario {

    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    //atributo de telelfonos

    //constructores
    public Usuario() {

    }

    public Usuario(String cedula, String nombre, String apellido, String correo,
            String contraseña) {
        this.setCedula(cedula);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCorreo(correo);
        this.setContraseña(contraseña);

    }

    //getters y setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = validarEspacios(cedula, 10);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = validarEspacios(nombre, 25);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = validarEspacios(apellido, 25);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {

        this.correo = validarEspacios(correo, 50);
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = validarEspacios(contraseña, 8);
    }

    public String validarEspacios(String cadena, int espacios) {
        if (cadena.length() == espacios) {
            return cadena;
        } else {
            if (cadena.length() < espacios) {
                cadena = llenarEspacios(cadena, espacios);
                return cadena;
            } else {
                cadena = cortarEspacios(cadena, espacios);
                return cadena;
            }
        }

    }

    public String llenarEspacios(String cadena, int espacios) {
        return String.format("%-" + espacios + "s", cadena);
    }

    public String cortarEspacios(String cadena, int espacios) {
        return cadena.substring(0, espacios);
    }

    @Override
    public String toString() {
        return "\nUsuario:\n" + "cedula: " + cedula + "\nnombre: " + nombre
                + ", apellido: " + apellido + "\ncorreo: " + correo
                + ", contraseña: " + contraseña;
    }
}
