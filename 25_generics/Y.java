class Y{
	public static void main(String... args){
		process(new Animal());
		process(new Student());
	}

	static <Z> void process(Z x){
		System.out.println(x);
	}
}

class Student{ }

class Employee{ }

class Animal{ }