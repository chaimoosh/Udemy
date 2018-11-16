package App;

public class StringBuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "";
		info += "My name is Bob";
		info += " "; 
		info += "I am a builder";
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue");
		sb.append(" ");
		sb.append("I have a face");
		
		System.out.println(sb.toString());
		
		StringBuilder sam = new StringBuilder();
		
		sam.append("Myname is dave ")
		.append("  ")
		.append("I like meatballs");
		
		System.out.println(sam.toString());
		
		//Formatting
		
		System.out.println("Here is something \tThat was a tab \nNew Line");
		
		
		System.out.printf("Total cost %-10d quantity is %d\n", 5, 54);
		
		for (int i = 0; i<20; i++) {
			System.out.printf("%2d: some %s\n", i, "Something");
		}
		
		System.out.printf("value %.1f", 5.676765765);
	}

}
