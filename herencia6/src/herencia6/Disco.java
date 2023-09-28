package herencia6;

class Disco extends Publicacion {
    private float duracion;
    
  
    public Disco(String titulo, float precio, float duracion) {
    	
        super(titulo, precio);
        this.duracion = duracion;
    }
    
	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("Duración (minutos, segundos): " + duracion);
    }
}