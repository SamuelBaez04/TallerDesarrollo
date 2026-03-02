/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.EjemplarLibro;
import modelo.Estado;
import modelo.Libro;

/**
 *
 * @author thomas
 */
public class ControladorLibro {
    
    private ArrayList<EjemplarLibro> libros;

    public ControladorLibro() {
        this.libros = new ArrayList<>();
    }
    
    public void agregarEjemplar(EjemplarLibro ejemplar){
        EjemplarLibro aux = buscarEjemplar(ejemplar.getIdLibro());
        if(aux == null){
            libros.add(ejemplar);
        }
    }
    
    
    public EjemplarLibro buscarEjemplar(int id){
        for (EjemplarLibro libro : libros) {
            if(libro.getIdLibro() == id){
                return libro;
            }
        }
        return null;
    }
    
    public boolean estaDisponible(EjemplarLibro ejemplar){
        return ejemplar.estaDisponible();
    }
    
    public void modificarEstado(EjemplarLibro ejemplar,Estado estado){
        ejemplar.setEstado(estado);
    }
    
    
    public void eliminarEjemplar(int id){
        EjemplarLibro aux = buscarEjemplar(id);
        if(aux != null){
            libros.remove(aux);
        }
    }
}
