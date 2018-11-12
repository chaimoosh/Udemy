package App;

class Person {
	String name;
	int age;
	
	void speak () {
		System.out.println("Hello");
	}
	
	int calculateYearsToRetirement() {
		int years = 65 - age;
		
		return years;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}

public class SetterGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person dave = new Person();
		dave.name = "Dave";
		dave.age = 3;
		
		dave.speak();
		int years = dave.calculateYearsToRetirement();
		int age = dave.getAge();
		String name = dave.getName();
		
	}

}
