package resturant;

public class Ingrediente {
    private String nombreIngrediente;
    private double cantidad;
    private int valorUnidad;
    private String sitioCompra;
    private int calorias;
    private Unidad unidad;

    public Ingrediente() {
    }

    public Ingrediente(String nombreIngrediente, double cantidad, int valorUnidad, String sitioCompra, int calorias, Unidad unidad) {
        this.nombreIngrediente = nombreIngrediente;
        this.cantidad = cantidad;
        this.valorUnidad = valorUnidad;
        this.sitioCompra = sitioCompra;
        this.calorias = calorias;
        this.unidad = unidad;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public int getValorUnidad() {
        return valorUnidad;
    }

    public String getSitioCompra() {
        return sitioCompra;
    }

    public int getCalorias() {
        return calorias;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public void setSitioCompra(String sitioCompra) {
        this.sitioCompra = sitioCompra;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Ingrediente [nombreIngrediente=" + nombreIngrediente + ", unidad=" + unidad + ", cantidad=" + cantidad + ", valorUnidad=" + valorUnidad
                + ", sitioCompra=" + sitioCompra + ", calorias=" + calorias + "]";
    }
}
