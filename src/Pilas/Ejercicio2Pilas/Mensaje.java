/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas.Ejercicio2Pilas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author johan
 */
public class Mensaje {
    private String autor;
    private String contenido;
    private String horaEnvio;
    
    public Mensaje(String autor, String contenido){
        this.autor = autor;
        this.contenido = contenido;
        //la hora se genera de manera automática dado que debe ser con un formato específico
        this.horaEnvio = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
    public String getAutor(){
        return autor;
    }
    public String getContenido(){
        return contenido;
    }
    public String getHoraEnvio(){
        return horaEnvio;
    }
    @Override
    public String toString(){
        return "["+horaEnvio+"]"+autor+": "+contenido;
    }
}
