/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author JHON FAREZ
 */
public class Telefono {
    private int codigo;
    private String numero;
    private String tipo;
    private String operadora;
    private Usuario usuario;
    
    public Telefono(){
    }

    public Telefono(int codigo, String numero, String tipo, String operadora) {
        this.codigo = codigo;
        this.numero = numero;
        this.tipo = tipo;
        this.operadora = operadora;
    }

    public Telefono(int codigo, String readUTF, String readUTF0, String readUTF1, boolean b) {

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
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
/**
 *Devuelve un numero entero que "identifica" al objeto cuando se guarda en una estructura 
 * de datos conocida como HashMap cuyo objetivo es almacenar un conjunto de valores
 * de forma similar a un array 
 * @return 
 */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.codigo;
        return hash;
    }
/**
 * Compara referencias entre objetos. Asi que no sobreescirbirlo al dafinir en clase
 * object es clara compara referncias entre objetos.
 * @param obj
 * @return 
 */
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
        return "Telefono{" + "codigo=" + codigo + ", numero=" + numero + ", tipo=" + tipo + ", operadora=" + operadora + '}';
    }
    
    
}
