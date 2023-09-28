package herencia6;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Hamnet  (Edición nueva)", 15000, 620, 2021);
        
        Disco disco = new Disco("rockerts", 50000 , 55.19f);
        
        System.out.println("Información del Libro:");
        libro.mostrar();
        System.out.println("_____________________________________");
        System.out.println("InInformación del Disco:");
        disco.mostrar();
    }
}