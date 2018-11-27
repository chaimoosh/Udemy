package upcast;

class Sheep {
	public void talk () {
		System.out.println("Sheep baahh");
	}
}

class Goat extends Sheep {
	public void talk () {
		System.out.println("Goat baahh");
	}
	
	public void make () {
		System.out.println("Pooping");
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheep sheep1 = new Sheep();
		Goat goat1 = new Goat ();
		
		Sheep sheep2 = goat1;
		
		goat1.talk();
		sheep1.talk();
		goat1.make();
		sheep2.talk();
		
		//Sheep sheep3 = new Goat();
		//Goat goat2 = (Goat)sheep3;
		
		//goat2.make();
		
		
	}

}
