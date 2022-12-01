import java.util.TreeMap;
import java.util.Comparator;

class Employee{
	String name;
	Integer age;

	Employee(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"~"+age;
	}
}

class EmpNameSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e1.name.compareTo(e2.name);
	}
}

class EmpNameRevSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e2.name.compareTo(e1.name);
	}
}

class EmpAgeSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e1.age.compareTo(e2.age);
	}
}

class EmpAgeRevSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e2.age.compareTo(e1.age);
	}
}

class K{
	public static void main(String[] args){
		TreeMap map = new TreeMap(new EmpAgeRevSort());
		
		map.put(new Employee("vikram",34), 23000);
		map.put(new Employee("raghav",45), 45000);
		map.put(new Employee("jitendra",28), 18000);
		map.put(new Employee("mayank",52), 67000);

		System.out.println(map);
	}
}










