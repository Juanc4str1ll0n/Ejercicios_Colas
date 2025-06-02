/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas.Ejercicio2Colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Daniel Contreras
 */
public class ColaClientes {
    private Queue<Cliente> cola;
    
    public ColaClientes(){
        cola = new LinkedList<>();
    }
    public void agregarClientes(Cliente cliente){
        cola.offer(cliente);
    }
    public Cliente atenderCliente(){
        return cola.poll();
    }
    public boolean estaVacia(){
        return cola.isEmpty();
    }
    public int obtenerTamanio(){
        return cola.size();
    }
    public String mostrarFila(){
        if(estaVacia()){
            return "No hay clientes en espera";
        }else{
            StringBuilder resultado = new StringBuilder();
            for (Cliente cliente : cola){
                resultado.append("-").append(cliente.getNombre()).append("\n");
            }
            return resultado.toString();
        }
    }
    public Cliente obtenerSiguiente(){
        return cola.peek();
    }
}
