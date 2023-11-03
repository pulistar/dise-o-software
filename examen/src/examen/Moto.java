package examen;

public class Moto extends Vehiculo {
	   private int cilindraje;

	   public Moto(String placa, int cilindraje) {
	       super(placa);
	       this.cilindraje = cilindraje;
	   }

	   public int getCilindraje() {
	       return cilindraje;
	   }

	   @Override
	   public int calcularPeaje() {
	       if (cilindraje < 200) {
	           return 5000;
	       } else {
	           return 7000;
	       }
	   }

	   @Override
	   public String toString() {
		  
	       return "Moto - Placa: " + getPlaca() + ", Cilindraje: " + cilindraje + "cc";
	   }
}
