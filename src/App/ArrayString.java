package App;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[3];
		words[0] = "face";
		words[1] = "green";
		String[] fruits = { "apple", "banana", "pear"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		String[] texts = new String[4];
		System.out.println(texts[1]);
	}

}
