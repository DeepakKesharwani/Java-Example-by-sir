class Student{
	String name;
	int age;

	public String toString(){
		return name+"~"+age;
	}

	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "mohan";
		s1.age = 12;

		Student s2 = new Student();
		s2.name = "ganesh";
		s2.age = 14;

		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s2.toString());
	}
}