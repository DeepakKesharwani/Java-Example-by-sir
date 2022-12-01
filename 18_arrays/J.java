class Student{
	String name;
	int age;
	//here we override the method String.
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

		Student[] x = new Student[2];
		//System.out.println(x);

		/*x[0] = s1;
		x[0] = s2;
		System.out.println(x[0].name);
		*/
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s2.toString());
	}
}