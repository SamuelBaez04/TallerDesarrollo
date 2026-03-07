/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Prestamo;

/**
 *
 * @author juanjoanduquia
 */
public class ControladorPrestamo {
    
    private ArrayList<Prestamo> listaPrestamos;

    public ControladorPrestamo() {
        this.listaPrestamos = new ArrayList<>();
    }
    
    public Prestamo buscarPrestamo(int id){
        for (Prestamo prestamo : listaPrestamos) {
            if(prestamo.getIdPrestamo() == id){
                return prestamo;
            }
        }
        return null;
    }
    
    public void registrarPrestamo(Prestamo prestamo){
        Prestamo aux = buscarPrestamo(prestamo.getIdPrestamo());
        if(aux == null){
            listaPrestamos.add(prestamo);
        }
    }
    
    public void cancelarPrestamo(int id){
        Prestamo prestamo = buscarPrestamo(id);
        if(prestamo != null){
            listaPrestamos.remove(prestamo);
        }
    }
    
}
