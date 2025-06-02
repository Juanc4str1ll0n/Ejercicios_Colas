/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas.Ejercicio2Colas;

/**
 *
 * @author Daniel Contreras
 */
public class Cliente {
    private String nombre;
    
    public Cliente(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public String toString(){
        return nombre;
    }
}
