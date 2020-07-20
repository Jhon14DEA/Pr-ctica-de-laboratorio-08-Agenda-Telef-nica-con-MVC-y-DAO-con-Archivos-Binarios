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
public class Telefono {

    //declaracion de atributos
    private int codigo;
    private String numero;
    private String tipo;
    private String operadora;
    private Usuario usuario;

   
    public Telefono() {
    }

 
    public Telefono(int codigo, String numero, String tipo, String operadora) {
        this.setCodigo(codigo);
        this.setNumero(numero);
        this.setTipo(tipo);
        this.setOperadora(operadora);
    }

  
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = validarEspacios(numero, 20);
    }

 
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = validarEspacios(tipo, 25);
    }

   
    public String getOperadora() {
        return operadora;
    }

    
    public void setOperadora(String operadora) {
        this.operadora = validarEspacios(operadora, 25);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.codigo;
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

   
    @Override
    public String toString() {
        return "\nTelefono:\n" + "codigo: " + codigo + ", numero: " + numero
                + "\ntipo: " + tipo + ", operadora: " + operadora;
    }
}
