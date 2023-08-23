package clases_objetos4;

public class Main {

	
	public static void main(String []args) {
		
		Account acountuno = new Account ("0010", "Cuenta de camilo", 100 ); 
		Account acountdos = new Account ("0020", "Cuenta de diego", 200 ); 
		
		acountuno.credit(100);
        acountdos.debit(500);
        acountuno.transferTo(acountdos, 100);

        
        System.out.println(acountuno);
        System.out.println(acountdos);
		
	}
	
	
}
