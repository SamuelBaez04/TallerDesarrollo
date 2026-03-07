/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juanjoanduquia
 */
public class Prestamo {
 
    private int idPrestamo;
    private Cliente cliente;
    private EjemplarLibro ejemplar;
    private String fechaPrestamo;
    private boolean activo;

    public Prestamo(int idPrestamo ,Cliente cliente, EjemplarLibro ejemplar, String fechaPrestamo, boolean activo) {
        this.idPrestamo = idPrestamo;
        this.cliente = cliente;
        this.ejemplar = ejemplar;
        this.fechaPrestamo = fechaPrestamo;
        this.activo = activo;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EjemplarLibro getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(EjemplarLibro ejemplar) {
        this.ejemplar = ejemplar;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
        
    
    
}
