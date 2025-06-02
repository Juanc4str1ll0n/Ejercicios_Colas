/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas.Ejercicio2Pilas;

/**
 *
 * @author johan
 */
public class ImplementacionPila {
    private PilaMensajes pilaMsg;
    public ImplementacionPila(){
        pilaMsg = new PilaMensajes();
    }
    public void recibirMensaje(String autor, String contenido){
        Mensaje nuevoMsg = new Mensaje(autor,contenido);
        pilaMsg.agregarMensaje(nuevoMsg);
    }
    public Mensaje verUltimo(){
        return pilaMsg.verUltimo();
    }
    public Mensaje eliminarUltimo(){
        return pilaMsg.eliminarUltimo();
    }
    public String verTodos(){
        return pilaMsg.verTodos();
    }
    public String verPorAutor(String autor){
        return pilaMsg.verMensajesDe(autor);
    }
    public boolean estaVacia(){
        return pilaMsg.estaVacia();
    }
    public int obtenerCantidad(){
        return pilaMsg.obtenerTamanio();
    }
}
