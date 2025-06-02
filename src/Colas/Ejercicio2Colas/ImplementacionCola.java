/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas.Ejercicio2Colas;

import java.util.Scanner;

/**
 *
 * @author Daniel Contreras
 */
public class ImplementacionCola {
   private ColaClientes colaClientes = new ColaClientes();
   
   public void agregarCliente(String nombre){
       Cliente nuevoCliente = new Cliente(nombre);
       colaClientes.agregarClientes(nuevoCliente);
   }
   public Cliente atenderCliente(){
       return colaClientes.atenderCliente();
   }
   public boolean colaVacia(){
       return colaClientes.estaVacia();
   }
   public String mostrarClientes(){
       return colaClientes.mostrarFila();
   }
   public int obtenerTamanio(){
       return colaClientes.obtenerTamanio();
   }
   public Cliente verSiguiente(){
       return colaClientes.obtenerSiguiente();
   }
}
