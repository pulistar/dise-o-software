package herencia2;

public class Person {
	private String name;
	private String address;
	
	//Constructor
	public Person(String name, String address) {
	
		this.name = name;
		this.address = address;
	}
	
	//getters and setters 
	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//methods
	
	public void printPerson() {
        System.out.println("NAME: " + name);
        System.out.println("ADDRESS: " + address);
      
      
    }
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	
	
}
