import java.util.TreeSet;

class Employee{
	String name;
	int age;

	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+" # "+age;
	}
}

class F{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add(new Employee("mohan",34)); 		
		set.add(new Employee("sohan",27)); 		
		set.add(new Employee("gohan",43)); 		
		set.add(new Employee("tohan",21)); 		
		set.add(new Employee("eohan",39));
		
		System.out.println(set);
	}
}












