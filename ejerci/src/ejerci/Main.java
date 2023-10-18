package ejerci;

public class Main {
    public static void main(String[] args) {
        Escaleno escaleno = new Escaleno(6, 8, 10);
        Acutangulo acutangulo = new Acutangulo(5, 12);

        System.out.println("Área del triángulo escaleno con hipotenusa: " + escaleno.CalcularAreaconHipotenusa(6, 10));
        System.out.println("Perímetro del triángulo escaleno: " + escaleno.Perimetro());

        System.out.println("Área del triángulo acutángulo con hipotenusa: " + acutangulo.CalcularAreaconHipotenusa(5, 12));
        System.out.println("Perímetro del triángulo acutángulo: " + acutangulo.Perimetro());
    }
}

