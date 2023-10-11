package polimorfismoejer1;

class Remolque {
    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Peso del Remolque: " + peso + " kg";
    }
}