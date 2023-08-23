package herencia4;

public class Cat extends Mammal {
	
	public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat [" + super.toString() + "]";
    }
	
	

}
