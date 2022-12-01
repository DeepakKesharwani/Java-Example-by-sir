import java.util.*;

class Employee{
	String name;
	Integer age;

	Employee(String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+" # "+age;
	}
}

class NameSort implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e1.name.compareTo(e2.name);
	}
}

class NameRevSort implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e2.name.compareTo(e1.name);
	}
}

class AgeSort implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e1.age.compareTo(e2.age);
	}
}

class AgeRevSort implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e2.age.compareTo(e1.age);
	}
}

class C3{
	public static void main(String[] args){
		List list = new ArrayList();

		list.add(new Employee("mohan", 12));
		list.add(new Employee("bohan", 34));
		list.add(new Employee("tohan", 60));
		list.add(new Employee("kohan", 45));
		list.add(new Employee("johan", 23));

		NameSort ns = new NameSort();
		AgeSort as = new AgeSort();
		AgeRevSort ars = new AgeRevSort();

		Collections.sort(list,ars);

		Employee e = new Employee("uhon",36);
		System.out.println(Collections.binarySearch(list,e,ars));
	}
}













