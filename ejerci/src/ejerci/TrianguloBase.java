package ejerci;

abstract class TrianguloBase {
    public abstract double Perimetro();

    public double CalcularAreaconHipotenusa(int lado, int hipotenusa) {
        double cateto = Math.sqrt(hipotenusa * hipotenusa - lado * lado);
        return 0.5 * lado * cateto;
    }
}





