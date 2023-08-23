package herencia1;

public class Main {
    public static void main(String[] args) {
       
        Circle circle = new Circle(2.5, "blue");

        
        System.out.println("Circle Properties:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());

        
        Cylinder cylinder = new Cylinder(2.0, 3.0, "green");

       
        System.out.println("\nCylinder Properties:");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
