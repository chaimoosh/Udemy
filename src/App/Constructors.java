package App;

class Machine {
	
	private String name;
	private int code;
	
	public Machine() {
		System.out.println("Constructing");
	}
	
	public Machine(String name) {
		this.name = name;
	}
	
	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
	}
}

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine("Arnie");
		Machine machine3 = new Machine("Harry", 67);
	}

}
