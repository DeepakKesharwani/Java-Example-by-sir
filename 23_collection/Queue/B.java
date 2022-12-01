import java.util.PriorityQueue;
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
	public int compare(Employee o1,Employee o2){
		return o1.name.compareTo(o2.name);
	}
}

class EmpNameRevSort implements Comparator<Employee>{
	public int compare(Employee o1,Employee o2){

		return o2.name.compareTo(o1.name);
	}
}

class EmpAgeSort implements Comparator<Employee>{
	public int compare(Employee o1,Employee o2){

		return o1.age.compareTo(o2.age);
	}
}

class EmpAgeRevSort implements Comparator<Employee>{
	public int compare(Employee o1,Employee o2){

		return o2.age.compareTo(o1.age);
	}
}

class B{
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
			PriorityQueue queue = new PriorityQueue(comp);

			queue.offer(new Employee("mohan",34)); 		
			queue.offer(new Employee("sohan",27)); 		
			queue.offer(new Employee("gohan",43)); 		
			queue.offer(new Employee("tohan",21)); 		
			queue.offer(new Employee("eohan",39));
			int size = queue.size();
			for(int i=0;i<size;i++){
				System.out.println(queue.poll());
			}
			
		}		
	}
}












