import java.util.TreeSet;

class Employee implements Comparable{
	String name;
	Integer age;

	Employee(String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+" # "+age;
	}
	
	/*
	public int compareTo(Object o){
		Employee e1 = this;
		Employee e2 = (Employee)o;

		Integer ag1 = e1.age;
		Integer ag2 = e2.age;

		return ag1.compareTo(ag2);
	}*/
	
	
	public int compareTo(Object o){
		Employee e1 = this;
		Employee e2 = (Employee)o;

		String nm1 = e1.name;
		String nm2 = e2.name;

		return nm1.compareTo(nm2); 
	}
}

class H{
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












