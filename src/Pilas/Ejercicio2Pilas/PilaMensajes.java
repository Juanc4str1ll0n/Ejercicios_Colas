/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas.Ejercicio2Pilas;

import java.util.Stack;

/**
 *
 * @author johan
 */
public class PilaMensajes {
    private Stack<Mensaje> pila;
    
    public PilaMensajes(){
        pila = new Stack<>();
    }
    public boolean estaVacia(){
        return pila.isEmpty();
    }
    public void agregarMensaje(Mensaje mensaje){
        pila.push(mensaje);
    }
    public Mensaje verUltimo(){
        if(!estaVacia()){
            return pila.peek();
        }
        return null;
    }
    public Mensaje eliminarUltimo(){
        if(!estaVacia()){
            return pila.pop();
        }
        return null;
    }
    public int obtenerTamanio(){
        return pila.size();
    }
    public String verTodos(){
        if(estaVacia()){
            return "Nada";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = obtenerTamanio()-1; i>=0; i--){    
            sb.append(pila.get(i)).append("\n");
        }
        return sb.toString();
    }
    public String verMensajesDe(String autor){
        boolean existe = false;
        StringBuilder sb = new StringBuilder();
        for(int i = obtenerTamanio()-1; i >= 0; i--){
            Mensaje msg = pila.get(i);
            if(msg.getAutor().equalsIgnoreCase(autor)){
                sb.append(msg).append("\n");
                existe = true;
            }
        }
        if(!existe){
            return "No hay mensajes de: "+autor+".";
        }
        return sb.toString();
    }
}
