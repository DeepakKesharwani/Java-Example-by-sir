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
		Student x1 = this;
		Student x2 = (Student)o;
		
		String nm1 = x1.name;
		String nm2 = x2.name;

		return nm1.equals(nm2);
	}
}

class C{
	public static void main(String[] args){
		Student s1 = new Student("mohan", 12);
		Student s2 = new Student("mohan", 12);

		C c = new C();
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(c));
	}
}












