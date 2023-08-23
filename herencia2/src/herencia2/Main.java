package herencia2;

public class Main {
	
	public static void main(String[]args) {
		
		Student studentone=new Student("camilo", "pandiaco", "ing. software", 2023, 4000000);
		
		System.out.println(" informacio del estudiante");
		studentone.printPerson(); 
		studentone.printStudent(); 
		
		
		Staff staffone=new Staff("jua", "centro", "liceo", 152151515); 
		
		System.out.println("informacion del Staff");
		staffone.printPerson(); 
		staffone.printStaff();
		
		
	}
	

}
