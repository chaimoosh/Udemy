package anon;

class Machine {
	public void start () {
		System.out.println("Machine starting");
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine() {
			public void start () {
				System.out.println("HAHAHAHA");
			}
		};
		machine1.start();
		
	}

}
