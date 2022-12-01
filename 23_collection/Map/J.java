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

class EmpNameSort implements Comparator{
	public int compare(Object o1,Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		String nm1 = e1.name;
		String nm2 = e2.name;

		return nm1.compareTo(nm2);
	}
}

class EmpNameRevSort implements Comparator{
	public int compare(Object o1,Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		String nm1 = e1.name;
		String nm2 = e2.name;

		return nm2.compareTo(nm1);
	}
}

class EmpAgeSort implements Comparator{
	public int compare(Object o1,Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		Integer ag1 = e1.age;
		Integer ag2 = e2.age;

		return ag1.compareTo(ag2);
	}
}

class EmpAgeRevSort implements Comparator{
	public int compare(Object o1,Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		Integer ag1 = e1.age;
		Integer ag2 = e2.age;

		return ag2.compareTo(ag1);
	}
}

class J{
	public static void main(String[] args){
		TreeMap map = new TreeMap(new EmpAgeSort());
		
		map.put(new Employee("vikram",34), 23000);
		map.put(new Employee("raghav",45), 45000);
		map.put(new Employee("jitendra",28), 18000);
		map.put(new Employee("mayank",52), 67000);

		System.out.println(map);
	}
}










