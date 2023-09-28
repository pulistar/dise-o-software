package herencia5;

class Direccion extends Nombre{
	private String calle;
	private String ciudad;
	private String provincia;
	private int postal;
	
	public Direccion(String nombre, String primerApellido, String segundoApellido, String calle, String ciudad, String provincia, int postal) {
		super(nombre, primerApellido, segundoApellido);
		this.calle = calle;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.postal = postal;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getPostal() {
		return postal;
	}

	public void setPostal(int postal) {
		this.postal = postal;
	}
	
    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("Calle: " + calle);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Provincia: " + provincia);
        System.out.println("Postal: " + postal);
    }

}