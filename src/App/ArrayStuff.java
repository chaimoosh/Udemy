package App;

public class ArrayStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values;
		
		values = new int[4];
		values[0] = 986867;
		System.out.println(values[0]);
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		int[] numbers = {5, 6, 7};
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] *= 4;
			System.out.println(numbers[i]);
		}
	}

}
