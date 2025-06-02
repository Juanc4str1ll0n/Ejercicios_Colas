/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas.Ejercicio1Pilas;

/**
 *
 * @author Daniel Contreras
 */
public class PaginaWeb {
    private String url;
    public PaginaWeb( String url){
        this.url = url;
    }
    public String getUrl(){
        return url;
    }
    @Override
    public String toString(){
        return url;
    }
}