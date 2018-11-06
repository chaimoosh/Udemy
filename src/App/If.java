package App;

public class If {
	public static void main(String[] args) {
		int myInt = 3;
		
		while(myInt < 8) {
			System.out.println("We're at " + myInt);
			if(myInt == 4) {
				break;
			}
			myInt++;
		}
	}
}
