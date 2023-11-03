package examen;

public class EstacionDePeaje {
    private String nombre;
    private String departamento;

    public EstacionDePeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public int cobrarPeaje(Vehiculo vehiculo) {
        return vehiculo.calcularPeaje();
    }

    public void total(int totalRecaudado) {
        System.out.println("Estación de Peaje: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Total recaudado: $" + totalRecaudado);
       
       
    }
}