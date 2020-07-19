/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

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
    //atributo de telefonos
    private List<Telefono> listaTelefonos;

    private Usuario() {
        listaTelefonos = new ArrayList<>();
    }
/**
 * Es un metodo especial de la clase Usuario que  sirve para llamar automaticamente
 * siempre que se declara un objeto de esa clase, su funciones es inicializar 
 * el objeto y sirve para asegurarnos que los objetos siempre ocntengan calores validos
 * @param cedula
 * @param nombre
 * @param apellido
 * @param correo
 * @param contraseña
 * @param listaTelefonos 
 */
 /*   public Usuario(String cedula, String nombre, String apellido, 
            String correo, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.listaTelefonos = new ArrayList<>();
    }
*/
    public Usuario(String cedula, String nombre, String apellido, 
            String correo, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.listaTelefonos = new ArrayList<>();
    }

       

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<Telefono> getListaTelefonos() {
        return listaTelefonos;
    }

    /*
    public void setListaTelefonos(List<Telefono> listaTelefonos) {
        this.listaTelefonos = listaTelefonos;
    }

     */
    public void eliminarTlfn(Telefono telefono) {
        /**
         * el metodo contains verifica si el String contiene otra subcadena o no
         * devuelve un baloor boleenao para que pueda  usurse directamanete 
         * dentro de la sentencia if
         */
        if (listaTelefonos.contains(telefono)) {
            int aux = listaTelefonos.indexOf(telefono);
            listaTelefonos.remove(aux);
        }
    }

    public void agregarTlfn(Telefono telefono) {
        listaTelefonos.add(telefono);
    }

    public void actualizarTlfn(Telefono telefono) {
        if (listaTelefonos.contains(telefono)) {
            /**
             * El metodo indexOf se usa para obtener el valor entero de un 
             * indice particular de objeto de tipo String, en base a los criterios espe
             * cificados en los parametros del metodo IndexOf
             */
            int aux = listaTelefonos.indexOf(telefono);
            listaTelefonos.set(aux, telefono);
        }
    }

    public List<Telefono> listarTlfns() {
        return listaTelefonos;
    }

    public Telefono buscarTlfns(Telefono telefono) {
        if (listaTelefonos.contains(telefono)) {
            int aux = listaTelefonos.indexOf(telefono);
            return listaTelefonos.get(aux);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ","
                + " nombre=" + nombre + ", apellido=" + apellido
                + ", correo=" + correo + ", contrase\u00f1a="
                + contraseña + ", listaTelefonos=" + listaTelefonos + '}';
    }

}
