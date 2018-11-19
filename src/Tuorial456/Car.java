package Tuorial456;

public class Car extends Machine {
	
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}

	public void start () {
		System.out.println("Car started");
	}
	
	public void windshield ( ) {
		System.out.println("I can see");
	}
	
	public void showName( ) {
		System.out.println(name);
	}
}
