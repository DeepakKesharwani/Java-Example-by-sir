/* Deserializing Same object in two different files  */
import java.io.File;
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
			File f1 = new File("a/a1/a2/a3");
			f1.mkdirs();
			File f2 = new File(f1,"kkr.txt");
			FileOutputStream fos = new FileOutputStream(f2);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			oos.writeObject(student);

			File f3 = new File("b/b1/b2/b3");
			f3.mkdirs();
			File f4 = new File(f3,"rcb.txt");
			FileOutputStream fos1 = new FileOutputStream(f4);
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