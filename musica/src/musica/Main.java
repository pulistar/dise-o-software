package musica;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ColeccionMusical coleccion = new ColeccionMusical();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. añadir Canción");
            System.out.println("2. modificar Canción");
            System.out.println("3. eliminar Canción");
            System.out.println("4. ver Canciones");
            System.out.println("5. salir");
            System.out.print("seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  
            switch (opcion) {
                case 1:
                    System.out.print("título de la canción: ");
                    String titulo = scanner.nextLine();
                    System.out.print("duración en minutos: ");
                    int duracionMinutos = scanner.nextInt();
                    System.out.print("duración en segundos: ");
                    int duracionSegundos = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("intérpretes (si son mas de un interprete separe los nombres por comas): ");
                    String interpretesInput = scanner.nextLine();
                    List<String> interpretes = List.of(interpretesInput.split(","));
                    System.out.print("compositor: ");
                    String compositor = scanner.nextLine();

                    Cancion nuevaCancion = new Cancion(titulo, duracionMinutos, duracionSegundos, interpretes, compositor);
                    coleccion.agregarCancion(nuevaCancion);
                    break;
                case 2:
                    coleccion.verCanciones();
                    System.out.print("indice de la canción a modificar: ");
                    int indiceModificar = scanner.nextInt();
                    scanner.nextLine();  
                    if (indiceModificar >= 0 && indiceModificar < coleccion.canciones.size()) {
                        System.out.print("nuevo título: ");
                        String nuevoTitulo = scanner.nextLine();
                        System.out.print("nueva duración en minutos: ");
                        int nuevaDuracionMinutos = scanner.nextInt();
                        System.out.print("nueva duración en segundos: ");
                        int nuevaDuracionSegundos = scanner.nextInt();
                        scanner.nextLine();  
                        System.out.print("nuevos intérpretes (separados por comas): ");
                        String nuevosInterpretesInput = scanner.nextLine();
                        List<String> nuevosInterpretes = List.of(nuevosInterpretesInput.split(","));
                        System.out.print("nuevo compositor: ");
                        String nuevoCompositor = scanner.nextLine();

                        coleccion.modificarCancion(indiceModificar, nuevoTitulo, nuevaDuracionMinutos, nuevaDuracionSegundos, nuevosInterpretes, nuevoCompositor);
                    } else {
                        System.out.println("indice inválido.");
                    }
                    break;
                case 3:
                    coleccion.verCanciones();
                    System.out.print("Índice de la canción a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    if (indiceEliminar >= 0 && indiceEliminar < coleccion.canciones.size()) {
                        coleccion.eliminarCancion(indiceEliminar);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    coleccion.verCanciones();
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}


