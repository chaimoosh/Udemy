package polymorphic;

class Face {
	private String name;
	public static final int ID = 98;
	
	public String getData () {
		String data = "somthing else" + calculateGrowth();
		return data;
	}
	
	private int calculateGrowth() {
		return 89;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Encapsulating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
