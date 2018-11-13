package App;

class Thing {
	public String name;
	public static String description;
	
	public void showName() {
		System.out.println(name);
	}
	
	public static void showInfo() {
		System.out.println("Hello");
	}
}

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing.description = "I am a thing";
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Dave";
		thing2.name = "Nate";
		
		thing1.showName();
		thing2.showName();
		Thing.showInfo();
	}

}
