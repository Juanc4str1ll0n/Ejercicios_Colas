/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Colas;


public class ColaImplementacion implements colas{

    
    //clase nodo que guarda libro
    private class Nodo{
        Libro libro;
        Nodo siguiente;
        
        
        Nodo(Libro libro){
            this.libro = libro;
            this.siguiente = null;
        }
        
    }
    
    private Nodo inicio;
    private Nodo fin;
    private int size;
    
    public ColaImplementacion(){
        this.inicio = null;
        this.fin = null;
        this.size = 0;
    }
    
    
    @Override
    public void encolar(Libro libro) {
        Nodo nuevo = new Nodo(libro);
        
        if(isVacia()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        size++;
    }

    @Override
    public void desencolar() {
        
        if(isVacia()){
            System.out.println("La cola esta vacia");
            return;
        }
        
        inicio = inicio.siguiente;
        size--;
        
        if(inicio == null){
            fin = null;
        }

    }

    @Override
    public Libro obtener() {
        if(isVacia()){
            System.out.println("La cola esta vacia, no hay libros");
            return null;
        }
        
        return inicio.libro;

    }
    
    @Override
    public int size(){
       return size; 
    }

    @Override
    public boolean isVacia() {
        return inicio == null;
    }
    
}
