package herencia3;

public class Rectangle extends Shape {
	
	private double width; 
	private double length; 
	
	public Rectangle() {
		
		super(); 
		this.width = 1.0; 
		this.length= 1.0; 	
	}
	
	public Rectangle(double width, double length) {
		super(); 
		this.width = width; 
		this.length = length; 
		
	}
	
	

}
