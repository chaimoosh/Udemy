package publucPrivate2;

public class Plant {
	public String name;
	
	public final static int ID = 9;
	
	private String type;
	
	protected String size;
	
	public Plant() {
		name = "I am a plant";
		type = "Plant";
		size = "large";
	}
}
