import java.util.ArrayList;

class Employee{
	String name;
	int age;
	
	public boolean equals(Object o){
		Employee e1 = this;
		Employee e2 = (Employee)o;

		String nm1 = e1.name;
		String nm2 = e2.name;

		int ag1 = e1.age;
		int ag2 = e2.age;

		System.out.println(e1.name+" ### "+e2.name);

		return nm1.equals(nm2);
	}

	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"~"+age;
	}	
}

class J{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(new Employee("mohan",34));
		list.add(new Employee("sohan",23));
		list.add(new Employee("rohan",21));
		list.add(new Employee("gohan",56));
		list.add(new Employee("tohan",43));

		System.out.println(list);
		
		Employee e = new Employee("sohan", 23);
		boolean flag = list.contains(e);
		//boolean flag = list.remove(e);


		System.out.println(flag);
	}
}












