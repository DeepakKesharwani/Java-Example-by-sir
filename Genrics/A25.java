class Y{
	public static void main(String[] args){
		process(new Student());
	}

	static <Z>void process(Z x){
		System.out.println(x);
	}
}
class Employee{
}
class Student{
}
class Animal{
}