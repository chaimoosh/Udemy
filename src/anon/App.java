package anon;

class Machine {
	public void start () {
		System.out.println("Machine starting");
	}
}

interface Plant {
	public void grow ();
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
	Plant plant1 = new Plant() {

		@Override
		public void grow() {
			// TODO Auto-generated method stub
			System.out.println("IM growing");
		}
		
	};
	
	plant1.grow();
	
	}

}
