package EjerciciosPracticos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        ArrayList<Boolean> completadas = new ArrayList<>();
        boolean salir = false;

        System.out.println("===== Gestor de Tareas Simple =====");

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1: // Agregar tarea
                    System.out.print("Introduce la nueva tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    tareas.add(nuevaTarea);
                    completadas.add(false);
                    System.out.println("Tarea agregada correctamente.");
                    break;

                case 2: // Mostrar tareas
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas registradas.");
                    } else {
                        System.out.println("\n===== Lista de Tareas =====");
                        for (int i = 0; i < tareas.size(); i++) {
                            String estado = completadas.get(i) ? "[✓]" : "[ ]";
                            System.out.println((i + 1) + ". " + estado + " " + tareas.get(i));
                        }
                    }
                    break;

                case 3: // Marcar como completada
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas para marcar.");
                    } else {
                        System.out.print("Introduce el número de la tarea a marcar como completada: ");
                        int indice = scanner.nextInt() - 1;
                        if (indice >= 0 && indice < tareas.size()) {
                            completadas.set(indice, true);
                            System.out.println("Tarea marcada como completada.");
                        } else {
                            System.out.println("Número de tarea inválido.");
                        }
                    }
                    break;

                case 4: // Eliminar tarea
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas para eliminar.");
                    } else {
                        System.out.print("Introduce el número de la tarea a eliminar: ");
                        int indice = scanner.nextInt() - 1;
                        if (indice >= 0 && indice < tareas.size()) {
                            System.out.println("Tarea eliminada: " + tareas.get(indice));
                            tareas.remove(indice);
                            completadas.remove(indice);
                        } else {
                            System.out.println("Número de tarea inválido.");
                        }
                    }
                    break;

                case 5: // Salir
                    salir = true;
                    System.out.println("¡Gracias por usar el Gestor de Tareas!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
