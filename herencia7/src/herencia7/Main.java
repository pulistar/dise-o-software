package herencia7;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.leerRadio(3);
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Circunferencia del círculo: " + circulo.circunferencia());

        Cilindro cilindro = new Cilindro();
        cilindro.leerRadio(5);
        cilindro.leerAltura(8,2);
        System.out.println("area del cilindro: " + cilindro.areac());
        System.out.println("Volumen del cilindro: " + cilindro.volumen());
        CilindroHueco cilindroHueco = new CilindroHueco();
        cilindroHueco.leerRadio(8);
        cilindroHueco.leerAltura(1,1);
        cilindroHueco.leerRadioInterior(2.0);
        System.out.println("Área superficial externa del cilindro hueco: " + cilindroHueco.areaSuperficialExterna());
        System.out.println("Área superficial interna del cilindro hueco: " + cilindroHueco.areaSuperficialInterna());
        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.volumen());
    }
}