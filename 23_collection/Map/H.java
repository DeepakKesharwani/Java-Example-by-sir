import java.util.TreeMap;

class Employee implements Comparable{
	String name;
	Integer age;

	Employee(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object o){
		Employee e1 = this;
		Employee e2 = (Employee)o;

		String nm1 = e1.name;
		String nm2 = e2.name;

		return nm1.compareTo(nm2);
	}

	public String toString(){
		return name+"~"+age;
	}
}

class H{
	public static void main(String[] args){
		TreeMap map = new TreeMap();
		
		map.put(new Employee("vikram",34), 23000);
		map.put(new Employee("raghav",45), 45000);
		map.put(new Employee("jitendra",28), 18000);
		map.put(new Employee("mayank",52), 67000);

		System.out.println(map);
	}
}










