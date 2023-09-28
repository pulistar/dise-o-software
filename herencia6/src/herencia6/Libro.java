package herencia6;

class Libro extends Publicacion {
    private int numPaginas;
    private int añoPublicacion;


    public Libro(String titulo, float precio, int numPaginas, int añoPublicacion) {
    	
        super(titulo, precio);
        this.numPaginas = numPaginas;
        this.añoPublicacion = añoPublicacion;
    }
    
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("Número de Páginas: " + numPaginas);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }
}
