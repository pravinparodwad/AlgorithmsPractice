package OOPConcepts;


class vehicle{
	int wheels;

	public vehicle() {
		System.out.println("vehicle");
	}
}

class Scooter extends vehicle{

	public Scooter() {
		System.out.println("scooter");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		Scooter s = new Scooter();
	}

}
