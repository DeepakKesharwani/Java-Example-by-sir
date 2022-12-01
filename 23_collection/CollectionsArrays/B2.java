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

class EmpNameRevSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e2.name.compareTo(e1.name);
	}
}

class B2{
	public static void main(String[] args){
		List list = new ArrayList();

		list.add(new Employee("mohan", 12));
		list.add(new Employee("bohan", 34));
		list.add(new Employee("tohan", 60));
		list.add(new Employee("kohan", 45));
		list.add(new Employee("johan", 23));

		System.out.println(list);
		Collections.sort(list, new EmpNameRevSort());
		System.out.println(list);
	}
}













