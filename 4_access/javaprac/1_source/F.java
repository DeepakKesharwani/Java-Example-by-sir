class Student{ 
	String name;
	int age;

	static int maxAge = 20;

	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "mohan";
		s1.age = 12;

		Student s2 = new Student();
		s2.name = "ganesh";
		s2.age = 14;

		s1.showInfo();
		s2.showInfo();

		Student.maxAge = 22;
	}

	void showInfo(){
		System.out.println(name);
	}
}