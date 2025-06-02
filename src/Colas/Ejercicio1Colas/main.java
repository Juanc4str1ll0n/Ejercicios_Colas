/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Colas.Ejercicio1Colas;

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
        Scanner scanner = new Scanner(System.in);
        ColaImplementacion cola = new ColaImplementacion();
        int opcion = 0;

        do {
            System.out.println("\n════════════════════════════════════");
            System.out.println("      MENÚ - GESTOR DE LIBROS     ");
            System.out.println("══════════════════════════════════════════");
            System.out.println(" 1. Encolar un libro                ");
            System.out.println(" 2. Desencolar (atender)           ");
            System.out.println(" 3. Ver primer libro en la cola    ");
            System.out.println(" 4. Ver cantidad de libros         ");
            System.out.println(" 5. Mostrar todos los libros       ");
            System.out.println(" 6. Salir                          ");
            System.out.println("╚══════════════════════════════════════════");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1 -> {
                    System.out.println("✏️ Ingresando nuevo libro:");
                    System.out.print("Nombre del libro: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Fecha de publicación (ej. 2023-11-02): ");
                    String fecha = scanner.nextLine();

                    Libro libro = new Libro(nombre, autor, fecha);
                    cola.encolar(libro);
                    System.out.println(" Libro agregado a la cola.");
                }

                case 2 -> {
                    if (cola.isVacia()) {
                        System.out.println("️ La cola está vacía. Nada que atender.");
                    } else {
                        Libro atendido = cola.obtener();
                        cola.desencolar();
                        System.out.println("? Libro atendido: " + atendido);
                    }
                }

                case 3 -> {
                    if (cola.isVacia()) {
                        System.out.println("️ La cola está vacía.");
                    } else {
                        System.out.println("? El primer libro en la cola es: " + cola.obtener());
                    }
                }

                case 4 -> {
                    System.out.println(" Hay " + cola.size() + " libro(s) en la cola.");
                }

                case 5 -> {
                    if (cola.isVacia()) {
                        System.out.println("️ La cola está vacía.");
                    } else {
                        System.out.println("? Listado completo de libros en la cola:");
                        ColaImplementacion temporal = new ColaImplementacion();
                        while (!cola.isVacia()) {
                            Libro libro = cola.obtener();
                            System.out.println("➡️ " + libro);
                            temporal.encolar(libro);
                            cola.desencolar();
                        }
                        // Restaurar los libros a la cola original
                        while (!temporal.isVacia()) {
                            cola.encolar(temporal.obtener());
                            temporal.desencolar();
                        }
                    }
                }

                case 6 -> {
                    System.out.println(" Gracias por usar el gestor de libros. ¡Hasta la próxima");
                }

                default -> System.out.println(" Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 6);
    }
    
    
}
