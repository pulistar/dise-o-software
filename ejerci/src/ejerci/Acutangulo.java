package ejerci;

class Acutangulo extends TrianguloBase {
    private int base, altura;

    public Acutangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double Perimetro() {
        // En un tri�ngulo acut�ngulo, todos los lados son diferentes, as� que el per�metro se calcula simplemente sumando los lados.
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}
