package clases_objetos5;

public class Main {
	
	public static void main(String[] args) {
        
        Author authoruno = new Author("Camilo Pulistar", "camilo.pulistar@campusucc,edu.co", 'm');

        System.out.println("Author:");
        System.out.println( "Nombre:" + authoruno.getName());
        System.out.println( "email:" + authoruno.getEmail());
        System.out.println( "Genero:" + authoruno.getGender());
	
	}
	
	
}


