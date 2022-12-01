/* Deserializing Same object in two different files  */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A{
	public static void main(String[] args){
		Employee employee = new Employee("Narendra",50,new EmployeeAddress(new EmployeeCity("Jabalpur"),new EmployeeState("MP"),"482001"));
		Employee employee1 = new Employee("Modi",55,new EmployeeAddress(new EmployeeCity("Nagpur"),new EmployeeState("MP"),"482003"));
		Student student = new Student("Rahul",50,new Address(new City("Kanpur"),new State("UP"),"482002"));
		Student student1 = new Student("Gandhi",52,new Address(new City("Raipur"),new State("UP"),"483002"));
		
		try{
			FileOutputStream fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			oos.writeObject(student);

			FileOutputStream fos1 = new FileOutputStream("pqr.txt");
			ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
			oos1.writeObject(employee1);
			oos1.writeObject(student1);
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	} 
}