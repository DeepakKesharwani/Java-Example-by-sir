class Student{
	String name;
	int age;

	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name+" - "+age;
	}

	public boolean equals(Object o){
		System.out.println(this+" ~");
		System.out.println(o+" ~");

		return true;
	}
}

class B{
	public static void main(String[] args){
		Student s1 = new Student("mohan", 12);
		Student s2 = new Student("mohan", 12);

		System.out.println(s1);
		System.out.println(s2);
		//System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}












