/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pilas.Ejercicio2Pilas;

import Pilas.Ejercicio1Pilas.*;
import java.util.Scanner;

/**
 *
 * @author johan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ImplementacionPila pilaMsgs = new ImplementacionPila();
        String opcion = "";
        while(opcion.equals("7")==false){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en pausa: " + e.getMessage());
            }
            System.out.println("-----MENU Bandeja de Entrada-----\n");
            System.out.println("1. Recibir nuevo mensaje.");
            System.out.println("2. Ver último mensaje recibido.");
            System.out.println("3. Eliminar último mensaje.");
            System.out.println("4. Ver todos los mensajes.");
            System.out.println("5. Ver mensajes de un chat específico");
            System.out.println("6. Obtener la cantidad de mensajes en la bandeja de entrada.");
            System.out.println("7. Salir.\n");
            System.out.println("Seleccione una opción: ");
            opcion = scan.nextLine();
            
            if (opcion.equals("1")){
                System.out.println("Autor: ");
                String autor = scan.nextLine();
                String autor_def = autor.substring(0, 1).toUpperCase()+autor.substring(1).toLowerCase();
                System.out.println("Contenido del mensaje: ");
                String contenido = scan.nextLine();
                pilaMsgs.recibirMensaje(autor_def, contenido);
                System.out.println("Mensaje recibido y agregado al historial\n");
            }else if(opcion.equals("2")){
                Mensaje ultimo = pilaMsgs.eliminarUltimo();
                if(ultimo == null){
                    System.out.println("No hay mensajes en la bandeja de entrada\n");
                }else{
                    System.out.println("último mensaje recibido: \n"+ultimo+"\n");
                }   
            }else if(opcion.equals("3")){
                Mensaje eliminado = pilaMsgs.eliminarUltimo();
                if(eliminado == null){
                    System.out.println("No hay mensajes para eliminar.\n");
                }else{
                    System.out.println("último mensaje eliminado: \n"+eliminado+"\n");
                } 
            }else if(opcion.equals("4")){
                if (pilaMsgs.verTodos().equalsIgnoreCase("Nada")){
                    System.out.println("No hay historial de mensajes en la bandeja de entrada.\n");
                }else{
                    System.out.println("Historial de mensajes: \n");
                    System.out.println(pilaMsgs.verTodos());
                }
            }else if(opcion.equals("5")){
                System.out.println("Ingrese el nombre del chat: ");
                String chatBuscado = scan.nextLine();
                String chat_def = chatBuscado.substring(0, 1).toUpperCase()+chatBuscado.substring(1).toLowerCase();
                System.out.println("Mensajes de: "+chat_def+"\n"+pilaMsgs.verPorAutor(chat_def));
            }else if(opcion.equals("6")){
                int cantidad = pilaMsgs.obtenerCantidad();
                if (cantidad == 0){
                    System.out.println("No hay mensajes en la bandeja de entrada");
                }else{
                    System.out.println("Hay "+cantidad+" mensaje(s) de en la bandeja de entrada");
                }
            }else if(opcion.equals("7")){
                break;
            }else{
                System.out.println("Opción no válida");
            }
        }
        System.out.println("Gracias por usar el programa");
        System.out.println("Saliendo de la bandeja de entrada...");
        scan.close();
    }
    
}
