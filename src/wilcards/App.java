package wilcards;

import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}

	public void start () {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	public String toString() {
		return "I am a camera";
	}
	
	public void snap () {
		System.out.println("Snap snap");
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Machine> list = new ArrayList();
		list.add(new Machine());
		list.add(new Machine());
		showList(list);
		
		ArrayList<Camera> list2 = new ArrayList();
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list2);
	}

	public static void showList(ArrayList<? extends Machine> list) {
		for(Machine value: list) {
			System.out.println(value);
			value.start();
		}
	}
}
