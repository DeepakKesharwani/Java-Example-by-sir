import java.util.TreeSet;
import java.util.Comparator;
import java.io.Console;

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

class EmpNameSort implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2){
		return o1.name.compareTo(o2.name);
	}
}

class EmpNameRevSort implements Comparator{
	public int compare(Object o1, Object o2){
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

class I{
	public static void main(String[] args){
		System.out.println("Enter 1 - NS, 2 - NRS, 3 - AS and 4 - ARS: ");
		Console con = System.console();

		String val = con.readLine();

		int actualVal = Integer.parseInt(val);
		
		boolean flag = true;
		Comparator comp = null;

		if(actualVal==1){
			comp = new EmpNameSort();
		}else if(actualVal==2){
			comp = new EmpNameRevSort();
		}else if(actualVal==3){
			comp = new EmpAgeSort();
		}else if(actualVal==4){
			comp = new EmpAgeRevSort();
		}else{
			System.out.println("Invalid Input");
			flag = false;
		}
		
		if(flag){
			TreeSet set = new TreeSet(comp);

			set.add(new Employee("mohan",34)); 		
			set.add(new Employee("sohan",27)); 		
			set.add(new Employee("gohan",43)); 		
			set.add(new Employee("tohan",21)); 		
			//.add(new Employee("null",0));
			
			System.out.println(set);
		}		
	}
}












