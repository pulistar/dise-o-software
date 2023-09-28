package clases_objetos;

import java.util.Scanner;
public class Main  {
	
	private static Scanner teclado;

	public static void main(String[]args) {
		
		teclado = new Scanner(System.in);
		
		Circle circleuno = new Circle();
		
		
		System.out.println("Circulo 1: ");
		
		circleuno.setRadius(teclado.nextDouble());
		
		circleuno.printCircle(); 
		
		System.out.println("El area es: " + circleuno.getArea());
		System.out.println("la circuferencia es: " + circleuno.getCircumference());
		
		
	}
	
	

}
