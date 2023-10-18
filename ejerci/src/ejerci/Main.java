package ejerci;

public class Main {
    public static void main(String[] args) {
        Escaleno escaleno = new Escaleno(6, 8, 10);
        Acutangulo acutangulo = new Acutangulo(5, 12);

        System.out.println("�rea del tri�ngulo escaleno con hipotenusa: " + escaleno.CalcularAreaconHipotenusa(6, 10));
        System.out.println("Per�metro del tri�ngulo escaleno: " + escaleno.Perimetro());

        System.out.println("�rea del tri�ngulo acut�ngulo con hipotenusa: " + acutangulo.CalcularAreaconHipotenusa(5, 12));
        System.out.println("Per�metro del tri�ngulo acut�ngulo: " + acutangulo.Perimetro());
    }
}

