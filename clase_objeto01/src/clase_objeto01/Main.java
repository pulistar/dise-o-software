package clase_objeto01;

public class Main {
	
	public static void main(String[]args) {
		
		Employee employeuno = new Employee (821112, "Camilo", "Pulistar", 3788780 );
		
		
		
		
		System.out.println("Primer empleado:");
		System.out.println("Nombre y apellido: " + employeuno.getName());
		System.out.println("ID: " + employeuno.getId());
		System.out.println("salario mensual:"+ employeuno.getSalary());
		System.out.println("Salario anual: " + employeuno.getAnnualSalary());
		
		double newSalary = employeuno.raiseSalary(15);

       
        System.out.println("Nuevo salario: " + newSalary);
		
		
		
	}
	

}
