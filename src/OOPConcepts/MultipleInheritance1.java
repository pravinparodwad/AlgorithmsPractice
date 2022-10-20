package OOPConcepts;


class CA{
	public String getRessult(char a, char b) {
		return ("A");
	}
}

class CB implements Interface{
	public String getRessult(char a, char b) {
		return ("B");
	}

	@Override
	public String getResult(char a, char b) {
		// TODO Auto-generated method stub
		return null;
	}
}


public class MultipleInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println("Output1 : "+b.getRessult('a', 'a'));
		
		A a = new A();
		System.out.println("Output1 : "+a.getRessult('a', 'a'));

	}

}
