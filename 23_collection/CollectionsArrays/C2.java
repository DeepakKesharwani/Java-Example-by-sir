import java.util.*;

class Employee implements Comparable<Employee>{
	String name;
	Integer age;

	Employee(String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public int compareTo(Employee e){
		return this.name.compareTo(e.name);
	}

	public String toString(){
		return name+" # "+age;
	}
}

class C2{
	public static void main(String[] args){
		List list = new ArrayList();

		list.add(new Employee("mohan", 12));
		list.add(new Employee("bohan", 34));
		list.add(new Employee("tohan", 60));
		list.add(new Employee("kohan", 45));
		list.add(new Employee("johan", 23));

		
		Collections.sort(list);
		Employee e = new Employee("iohan",45);
		System.out.println(Collections.binarySearch(list,e));
	}
}













