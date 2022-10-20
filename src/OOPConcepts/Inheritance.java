package OOPConcepts;

class Base {
	private int i;
	public Base() {
		System.out.println("no parameterized constructor");
	}
	
	public Base(int i) {
		this.i = i;
		System.out.println("Base parameterized constructor");
	}
	
	public void show() {
		System.out.println("Parent method");
	}

}

class Child extends Base{
	public Child(int i) {
//		super(i);
		System.out.println("Child parameterized constructor");
	}
	public void show() {
		super.show();
		System.out.println("Child method");
	}

}

public class Inheritance{
	public static void main(String[] args) {
		Base base = new Child(10);
		base.show();
	}
}
