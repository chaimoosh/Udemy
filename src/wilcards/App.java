package wilcards;

import java.util.ArrayList;

class Machine {
	
}

class Camera extends Machine {
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList();
		list.add("1");
		
		showList(list);
	}

	public static void showList(ArrayList<String> list) {
		for(String value: list) {
			System.out.println(value);
		}
	}
}
