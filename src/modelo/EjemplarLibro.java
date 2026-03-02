/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author thomas
 */
public class EjemplarLibro {
    
    private int idLibro;
    private Libro referenciaLibro;
    private Estado estado;

    public EjemplarLibro(int idLibro, Libro referenciaLibro, Estado estado) {
        this.idLibro = idLibro;
        this.referenciaLibro = referenciaLibro;
        this.estado = estado;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public Libro getReferenciaLibro() {
        return referenciaLibro;
    }

    public void setReferenciaLibro(Libro referenciaLibro) {
        this.referenciaLibro = referenciaLibro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public boolean estaDisponible(){
        if(this.estado.equals(Estado.DISPONIBLE)){
            return true;
        }
        return false;
    }
    
}
