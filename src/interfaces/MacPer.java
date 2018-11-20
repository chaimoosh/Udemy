package interfaces;

public class MacPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mach1 = new Machine();
		mach1.start();
		mach1.showInfo();
		
		Person person1 = new Person("Bobby");
		person1.greet();
		person1.showInfo();
		
		Info info1 = new Machine();
		
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		infoPut(mach1);
	}
	
	private static void infoPut(Info info) {
		info.showInfo();
	}
}
