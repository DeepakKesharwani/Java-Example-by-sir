import java.util.TreeSet;
//import java.util.Comparator;

class Employee
{
	String name;
	Integer age;

	Employee(String name,Integer age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name+" - "+age;
	}
	public int compareTo(Object o){
		Employee e1 = this;
		Employee e2 = (Employee)o;

		String nm1 = e1.name;
		String nm2 = e2.name;

		return nm1.compareTo(nm2);
	}
}

class D
{
	public static void main(String[] args){
		TreeSet set = new TreeSet();
		set.add(new Employee("mohan",12));
		set.add(new Employee("sohan",23));
		set.add(new Employee("rohan",34));
		set.add(new Employee("gohan",21));

		System.out.println(set);
	
	
	}
}