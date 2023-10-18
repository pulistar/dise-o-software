package ejerci;

class Acutangulo extends TrianguloBase {
    private int base, altura;

    public Acutangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double Perimetro() {
        // En un triángulo acutángulo, todos los lados son diferentes, así que el perímetro se calcula simplemente sumando los lados.
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}
