class Student{
	String name;
	int age;

	Student(String name,int age){
		System.out.println(this.age);
		System.out.println(age);
		
		this.name = name;
		this.age = age;
	}
}

class J{
	public static void main(String[] args){
		Student x = new Student("ganesh",14);
		
		System.out.println(x.name);
		System.out.println(x.age);
		
	}
}