package generics;
import java.util.ArrayList;


public class App {
	public static void main(String[] args) {
		/////// Old Style //////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(0);
		
		System.out.println(fruit);
		//////// New Style ///////
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("cat");
		list1.add("dog");
		list1.add("donkey");
		
		String animal = list1.get(1);
		
		System.out.println(animal);
	}
}
