/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Colas.Ejercicio2Colas;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ImplementacionCola app = new ImplementacionCola();
        String opcion = "";
        while(opcion != "6"){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en pausa: " + e.getMessage());
            }
            System.out.println("-----MENU Atención a clientes en una fila-----\n");
            System.out.println("1. Agregar Cliente.");
            System.out.println("2. Atender al siguiente cliente.");
            System.out.println("3. Mostrar fila.");
            System.out.println("4. Obtener cantidad de clientes en espera.");
            System.out.println("5. Mostrar siguiente cliente.");
            System.out.println("6. Salir.\n");
            System.out.println("Seleccione una opción: ");
            opcion = scan.nextLine();
            
            if (opcion.equals("1")){
                System.out.println("Ingrese el nombre del cliente");
                String nombre = scan.nextLine();
                String nombreDef = nombre.substring(0, 1).toUpperCase()+nombre.substring(1).toLowerCase();
                app.agregarCliente(nombreDef);
                System.out.println("Cliente agregado\n");
            }else if(opcion.equals("2")){
                Cliente atendido = app.atenderCliente();
                if(atendido == null){
                    System.out.println("No hay clientes por atender\n");
                }else{
                    System.out.println("Atendiendo a: "+atendido.getNombre()+"\n");
                }   
            }else if(opcion.equals("3")){
                System.out.println("Clientes en espera: ");
                System.out.println(app.mostrarClientes());
            }else if(opcion.equals("4")){
                int cantidad = app.obtenerTamanio();
                System.out.println("La cantidad de clientes en espera es: "+cantidad+"\n");
            }else if(opcion.endsWith("5")){
                System.out.println("El siguiente cliente es: "+app.verSiguiente().getNombre()+"\n");
            }else if(opcion.equals("6")){
                break;
            }else{
                System.out.println("Opción no válida");
            }
        }
        System.out.println("Gracias por usar el programa.");
        scan.close();
    }
    
}
