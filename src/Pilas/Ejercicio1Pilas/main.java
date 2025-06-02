/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pilas.Ejercicio1Pilas;

import Colas.Ejercicio2Colas.*;
import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ImplementacionPila navegador = new ImplementacionPila();
        String opcion = "";
        while(opcion.equals("6")==false){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en pausa: " + e.getMessage());
            }
            System.out.println("-----MENU Historial de navegador web-----\n");
            System.out.println("1. Visitar nueva página.");
            System.out.println("2. Retroceder (eliminar sitio web).");
            System.out.println("3. Ver página actual.");
            System.out.println("4. Mostrar historial de navegación.");
            System.out.println("5. Obtener la cantidad de sitios web en el historial");
            System.out.println("6. Salir.\n");
            System.out.println("Seleccione una opción: ");
            opcion = scan.nextLine();
            
            if (opcion.equals("1")){
                System.out.println("Ingrese la dirección URL: ");
                String Url = scan.nextLine();
                navegador.visitarPagina(Url);
                System.out.println("Página visitada y agregada al historial\n");
            }else if(opcion.equals("2")){
                PaginaWeb anterior = navegador.retroceder();
                if(anterior == null){
                    System.out.println("No hay páginad anteriores que se hayan visitado\n");
                }else{
                    System.out.println("Se ha retrocedido desde: "+anterior.getUrl()+"\n");
                }   
            }else if(opcion.equals("3")){
                PaginaWeb actual = navegador.verPaginaActual();
                if (actual == null){
                    System.out.println("No estás ubicado en ninguna página\n");
                }else{
                    System.out.println("Página actual: "+actual.getUrl()+"\n");
                }
            }else if(opcion.equals("4")){
                if (navegador.mostrarHistorial().equalsIgnoreCase("Nada")){
                    System.out.println("No hay historial de navegación");
                }else{
                    System.out.println("Historial de navegación: \n");
                    System.out.println(navegador.mostrarHistorial());
                }
            }else if(opcion.endsWith("5")){
                int cantidad = navegador.obtenerTamanio();
                if(cantidad == 0){
                    System.out.println("No hay sitios web en el historial\n");
                }else{
                    System.out.println("Hay "+cantidad+" sitio(s) en el historial de navegación\n");
                }
            }else if(opcion.equals("6")){
                break;
            }else{
                System.out.println("Opción no válida");
            }
        }
        System.out.println("Gracias por usar el programa");
        System.out.println("Saliendo del navegador...");
        scan.close();
    }
    
}
