package clases_objetos02;

public class Main {
	
	public static void main(String[]args) {
		
		InvoiceItem itemuno = new InvoiceItem("82112",  "wuapo",  10,  1000 );
		
		
		System.out.println("Descripcion del Items: ");
		System.out.println("ID: " + itemuno.getId());
		System.out.println("descripcion:" + itemuno.getDesc());
		System.out.println("cantidad de paquete: " + itemuno.getQty());
		System.out.println("valor unitario:" + itemuno.getUnitPrice());
		
		System.out.println("valor total: "+ itemuno.getTotal());
		
		
		
	}

}
