package examen;

public abstract class Vehiculo {
   private String placa;

   public Vehiculo(String placa) {
       this.placa = placa;
   }

   public String getPlaca() {
       return placa;
   }

   public abstract int calcularPeaje();

   @Override
   public String toString() {
       return "Vehículo - Placa: " + placa;
   }
}





