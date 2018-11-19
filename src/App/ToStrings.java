package App;

class Froggy {
	private String name;
	private int id;
	
	public Froggy(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return String.format("%4d: %s", id, name);
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
	}
}

public class ToStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Froggy frog1 = new Froggy("Bob", 89);
		
		System.out.println(frog1);
		
	}

}
