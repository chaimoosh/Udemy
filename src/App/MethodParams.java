package App;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("I can jump " + height + " feet!!!");
	}
	
	public void move(String direction, double distance) {
		System.out.println("I am moving" + distance + direction);
	}
}

public class MethodParams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot sam = new Robot();
		sam.speak("Hi I'm Sam the Man");
		sam.jump(45);
		sam.move("south", 4.67);
	}

}
