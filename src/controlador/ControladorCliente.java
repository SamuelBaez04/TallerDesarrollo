/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author juanjoanduquia
 */
public class ControladorCliente {

    
    private ArrayList<Cliente> listaDeclientes;

    public ControladorCliente() {
        this.listaDeclientes = new ArrayList<>();
    }

    public Cliente buscarCliente(String documento) {
        for (int i = 0; i < listaDeclientes.size(); i++) {
            if (listaDeclientes.get(i).getDocumento().equals(documento)) {
                return listaDeclientes.get(i);
            }

        }
        return null;

    }

    public boolean guardarCliente(Cliente cliente) {
        Cliente aux = buscarCliente(cliente.getDocumento());
        if (aux == null) {
            listaDeclientes.add(cliente);
            return true;

        }
        return false;
    }

    public boolean eliminarCliente(String documento) {
        for (int i = 0; i < listaDeclientes.size(); i++) {
            if (listaDeclientes.get(i).getDocumento().equals(documento));
            listaDeclientes.remove(i);
            return true;

        }
        return false;

    }

    public boolean prestarLibro(boolean tienePrestamo) {
        if (tienePrestamo == true) {
            return false;
        }
        return true;

    }

}
