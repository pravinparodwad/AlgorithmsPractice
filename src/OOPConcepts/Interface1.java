package OOPConcepts;

interface InterfaceDemo {
	public static final String s1 = "";
	
	public abstract void show();
	
	default void display() {
		System.out.println("default method");
	}

}

public class Interface1 implements InterfaceDemo{
	public static void main(String[] args) {
		Interface1 d = new Interface1();
		d.show();
		d.display();
	}

	@Override
	public void show() {
		System.out.println("overridden method");
	}
}