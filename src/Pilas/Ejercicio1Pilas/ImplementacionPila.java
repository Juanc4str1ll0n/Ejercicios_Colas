/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas.Ejercicio1Pilas;

/**
 *
 * @author Daniel Contreras
 */
public class ImplementacionPila {
    private PilaHistorial historial = new PilaHistorial();
    
    public void visitarPagina(String url){
        historial.visitarPagina(new PaginaWeb(url));
    }
    public PaginaWeb retroceder(){
        return historial.retroceder();
    }
    public PaginaWeb verPaginaActual(){
        return historial.verActual();
    }
    public String mostrarHistorial(){
        return historial.mostrarHistorial();
    }
    public boolean estaVacio(){
        return historial.estaVacio();
    }
    public int obtenerTamanio(){
        return historial.obtenerTamanio();
    }
}