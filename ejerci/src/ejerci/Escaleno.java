package ejerci;

class Escaleno extends TrianguloBase {
    private int lado1, lado2, lado3;

    public Escaleno(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double Perimetro() {
        return lado1 + lado2 + lado3;
    }
}