import java.util.TreeMap;

class Employee implements Comparable<Employee>{
	String name;
	Integer age;

	Employee(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public int compareTo(Employee o){
		return this.name.compareTo(o.name);
	}

	public String toString(){
		return name+"~"+age;
	}
}

class I{
	public static void main(String[] args){
		TreeMap map = new TreeMap();
		
		map.put(new Employee("vikram",34), 23000);
		map.put(new Employee("raghav",45), 45000);
		map.put(new Employee("jitendra",28), 18000);
		map.put(new Employee("mayank",52), 67000);

		System.out.println(map);
	}
}










