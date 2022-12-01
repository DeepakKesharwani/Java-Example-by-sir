class Employee
{
	String name;
	Integer age;

	public String toString(){
		return name+"~"+age;
	}
	public static void main(String[] args){
		Employee emp1 = new Employee();
		emp1.name = "Ganesh";
		emp1.age = 14;

		Employee emp2  = new Employee();
		emp2.name = "Hanuman";
		emp2.age = 22;
		Employee [] x = new Employee[2];
		System.out.println(emp1);
		System.out.println(emp1.toString());
		System.out.println(emp2);
		System.out.println(emp2.toString());
	}
	
}