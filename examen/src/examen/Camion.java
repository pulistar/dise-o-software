package examen;

public class Camion extends Vehiculo {
	   private int numeroEjes;

	   public Camion(String placa, int numeroEjes) {
	       super(placa);
	       this.numeroEjes = numeroEjes;
	   }

	   public int getNumeroEjes() {
	       return numeroEjes;
	   }

	   @Override
	   public int calcularPeaje() {
	       return 5000 * numeroEjes;
	   }

	   @Override
	   public String toString() {
		   
	       return "Cami�n - Placa: " + getPlaca() + ", N�mero de Ejes: " + numeroEjes;
	      
	   }
}

