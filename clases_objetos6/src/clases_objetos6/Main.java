package clases_objetos6;

public class Main {
    public static void main(String[] args) {
    	
    	
        Author author = new Author("C.P Lopez", "camilo.pulistar@campuscc.edu.co", 'M');
        Book book = new Book("Soy el Rey", author, 100000, 2);
        
        
        
       
        System.out.println("informacio del autor: ");
        System.out.println("Name:" + author.getName());
        System.out.println("email: " + author.getEmail());
        System.out.println("gender: " + author.getGender());
       
        
        System.out.println("Informacion book:");
        
        System.out.println("Nombre del book: " + book.getName());
            
        System.out.println("Precio: " + book.getPrice());
        System.out.println("email: " + book.getQty());
        
        
	
    }
}