package App;

class Thing {
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	public static int count = 0;
	public int id;
	
	public Thing() {
		id = count;
		count++;
	}
	
	public void showName() {
		System.out.println(name);
	}
	
	public static void showInfo() {
		System.out.println(description);
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
		System.out.println(thing1.id);
		thing2.showName();
		System.out.println(thing2.id);
		Thing.showInfo();
		
		System.out.println(Math.PI);
		System.out.println(thing1.LUCKY_NUMBER);
		System.out.println(Thing.count);
	}

}
