package examen;

public class Carro extends Vehiculo {
	   public Carro(String placa) {
	       super(placa);
	   }

	   @Override
	   public int calcularPeaje() {
		
	       return 10000;
	   }
	   @Override
	   public String toString() {
		  
	       return "Carro - Placa: " + getPlaca();
	   }
}

