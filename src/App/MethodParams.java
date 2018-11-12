package App;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
}

public class MethodParams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot sam = new Robot();
		sam.speak("Hi I'm Sam the Man");
	}

}
