/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas.Ejercicio1Colas;

public class Libro {
    private String nombre;
    private String autor;
    private String fecha;

    // Constructor
    public Libro(String nombre, String autor, String fecha) {
        this.nombre = nombre;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "📖 \"" + nombre + "\" de " + autor + " (📅 " + fecha + ")";
    }
}
