package Something;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intVal = 7;
		short shortVal = 43;
		byte byteVal = 3;
		long longVal = 987;
		double doubleVal = 654.43;
		float floatVal = 543.5f;
		float floatVal2 = (float)543.6;
		
		intVal = (int)longVal;
		System.out.println(intVal);
		
		doubleVal = intVal;
		System.out.println(doubleVal);
		
		intVal = (int)floatVal;
		System.out.println(intVal);
		
		byteVal = (byte)123;
		
		System.out.println(byteVal);
	}

}
