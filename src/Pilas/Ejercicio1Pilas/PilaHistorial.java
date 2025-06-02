/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas.Ejercicio1Pilas;

import java.util.Stack;

/**
 *
 * @author Daniel Contreras
 */
public class PilaHistorial {
    private Stack<PaginaWeb> historial;
    public PilaHistorial(){
        historial = new Stack<>();
    }
    public void visitarPagina(PaginaWeb pagina){
        historial.push(pagina);
    }
    public PaginaWeb retroceder(){
        if(!historial.isEmpty()){
            return historial.pop();
        }
        return null;
    }
    public PaginaWeb verActual(){
        if(historial.isEmpty()){
            return null;
        }else{
            return historial.peek();
        }
    }
    public boolean estaVacio(){
        return historial.isEmpty();
    }
    public int obtenerTamanio(){
        return historial.size();
    }
    public String mostrarHistorial(){
        if(estaVacio()){
            return "Nada";
        }else{
            StringBuilder resultado = new StringBuilder();
            for (PaginaWeb sitio : historial){
                resultado.append("-").append(sitio.getUrl()).append("\n");
            }
            return resultado.toString();
        }
    }
}