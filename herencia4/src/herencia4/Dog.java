package herencia4;

public class Dog extends Mammal {
	
	
	public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog [" + super.toString() + "]";
    }

}
