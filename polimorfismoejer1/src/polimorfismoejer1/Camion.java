package polimorfismoejer1;


class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int cantidad) {
        if (remolque != null && (getVelocidad() + cantidad) > 100) {
            System.out.println("El camión va demasiado rápido con el remolque.");
        } else {
            super.acelerar(cantidad);
        }
    }

    @Override
    public String toString() {
        if (remolque != null) {
            return super.toString() + "\n" + remolque.toString();
        } else {
            return super.toString();
        }
    }
}