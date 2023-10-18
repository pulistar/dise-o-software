package resturant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			String usuarioPredeterminado = "camilo";
			String contraseñaPredeterminada = "123";
			int intentos = 3;

			while (intentos > 0) {
			    System.out.println("Bienvenido a La Merced");
			    System.out.print("Nombre de usuario: ");
			    String nombreUsuario = scanner.next();
			    System.out.print("Contraseña: ");
			    String contraseña = scanner.next();

			    if (nombreUsuario.equals(usuarioPredeterminado) && contraseña.equals(contraseñaPredeterminada)) {
			        Usuario usuario = new Usuario(1, nombreUsuario, contraseña);
			        Receta receta = new Receta(4, 20, (byte) 5, "Instrucciones de preparación");
			        LaMerced merced = new LaMerced(usuario, receta);
			        boolean continuar = true;

			        while (continuar) {
			            System.out.println("Menú de opciones:");
			            System.out.println("1. Agregar ingrediente");
			            System.out.println("2. Eliminar ingrediente");
			            System.out.println("3. Mostrar ingredientes");
			            System.out.println("4. Salir");
			            System.out.print("Seleccione una opción: ");
			            int opcion = scanner.nextInt();

			            switch (opcion) {
			                case 1:
			                    System.out.print("Nombre del ingrediente: ");
			                    String nombreIngrediente = scanner.next();
			                    System.out.print("Unidad (ejemplo: LITRO, KILOGRAMO, GRAMO, MILILITROS, ONZAS): ");
			                    String unidadStr = scanner.next();
			                    Unidad unidad = Unidad.valueOf(unidadStr);

			                    System.out.print("Cantidad: ");
			                    
			                    double cantidad = scanner.nextDouble();
			                    if(cantidad>=0) {
			                    	System.out.print("Valor de unidad: ");
				                    int valorUnidad = scanner.nextInt();
				                    if(valorUnidad>=0) {
				                    	System.out.print("Sitio de compra: ");
					                    String sitioCompra = scanner.next();
					                    System.out.print("Calorías: ");
					                    int calorias = scanner.nextInt();
					                    if(calorias>=0) {
					                    	Ingrediente nuevoIngrediente = new Ingrediente(nombreIngrediente, cantidad, valorUnidad, sitioCompra, calorias, unidad);
						                    merced.agregarIngrediente(nuevoIngrediente);
						                    System.out.println("Ingrediente agregado con éxito.");
					                    }
					                    else {
					                    	System.out.println("digite un numero positivo");
					                    }
				                    }
				                    else {
				                    	System.out.println("digite un numero positivo");
				                    }
				                    
			                    }
			                    else {
			                    	System.out.println("digite un numero positivo");
			                    }

			                    
			                    break;
			                case 2:
			                    if (merced.getIngredientes().isEmpty()) {
			                        System.out.println("No hay ingredientes para eliminar.");
			                    } else {
			                        System.out.println("Lista de ingredientes:");
			                        for (int i = 0; i < merced.getIngredientes().size(); i++) {
			                            System.out.println((i + 1) + ". " + merced.getIngredientes().get(i));
			                        }
			                        System.out.print("Seleccione el número del ingrediente a eliminar: ");
			                        int indice = scanner.nextInt();
			                        if (indice >= 1 && indice <= merced.getIngredientes().size()) {
			                            merced.eliminarIngrediente(merced.getIngredientes().get(indice - 1));
			                            System.out.println("Ingrediente eliminado con éxito.");
			                        } else {
			                            System.out.println("Número de ingrediente no válido.");
			                        }
			                    }
			                    break;
			                case 3:
			                    System.out.println("Ingredientes en La Merced:");
			                    for (int i = 0; i < merced.getIngredientes().size(); i++) {
			                        System.out.println((i + 1) + ". " + merced.getIngredientes().get(i));
			                    }
			                    break;
			                case 4:
			                    continuar = false;
			                    break;
			                default:
			                    System.out.println("Opción no válida.");
			                    break;
			            }
			        }
			        System.out.println("Gracias por usar La Merced.");
			        break;
			    } else {
			        intentos--;
			        if (intentos > 0) {
			            System.out.println("Usuario o contraseña incorrectos. Intentos restantes: " + intentos);
			        } else {
			            System.out.println("Alejate o llamo a la policía.");
			        }
			    }
			}
		}
    }
}


