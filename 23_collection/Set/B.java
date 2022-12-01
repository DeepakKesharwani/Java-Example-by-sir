import java.util.HashSet;

class Student{
	String name;
	int age;

	Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+" ~ "+age;
	}

	public boolean equals(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		String nm1 = s1.name;
		String nm2 = s2.name;

		int ag1 = s1.age;
		int ag2 = s2.age;

		return nm1.equals(nm2)&&ag1==ag2;
	}
}

class B{
	public static void main(String[] args){
		HashSet set = new HashSet();

		set.add(new Student("ganesh",23));
		set.add(new Student("vikram",12));
		set.add(new Student("aditya",14));
		set.add(new Student("sandesh",27));
		set.add(new Student("videsh",8));
		set.add(new Student("vikram",12));

		System.out.println(set);

		Student x = new Student("aditya", 14);
		
		System.out.println(set.contains(x));
	}
}














