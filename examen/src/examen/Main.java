package examen;

public class Main {
    public static void main(String[] args) {
        EstacionDePeaje peaje = new EstacionDePeaje("Chachagui", "Nariño");

        System.out.println("Vehículos que pasaron por el peaje:");
        
        Vehiculo carro1 = new Carro("CVA708");
        System.out.println(carro1);
        
        Vehiculo moto1 = new Moto("DQP891", 180);
        System.out.println(moto1);
        
        Vehiculo camion1 = new Camion("GHI789", 10);
        System.out.println(camion1);
        
        int totalRecaudado = peaje.cobrarPeaje(carro1) + peaje.cobrarPeaje(moto1) + peaje.cobrarPeaje(camion1);
        peaje.total(totalRecaudado);
    
    }
    
    
}