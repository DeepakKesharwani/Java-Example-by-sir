class Student{
	String name;
	int age;
}

class I{
	public static void main(String[] args){
		Student x = new Student();
		
		System.out.println(x.name);
		System.out.println(x.age);

		x.name = "mohan";
		x.age = 12;

		System.out.println(x.name);
		System.out.println(x.age);
	}
}