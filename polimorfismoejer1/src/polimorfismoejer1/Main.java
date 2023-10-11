package polimorfismoejer1;


public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("ABC123", 4);
        coche.acelerar(50);
        System.out.println(coche.toString());

        Remolque remolque = new Remolque(2000);

        Camion camion = new Camion("XYZ789");
        camion.ponRemolque(remolque);
        camion.acelerar(90);
        System.out.println(camion.toString());

        camion.quitaRemolque();
        camion.acelerar(110);
        System.out.println(camion.toString());
    }
}