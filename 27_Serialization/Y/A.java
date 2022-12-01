/* Here we make the directory in we serialize or deserialize the file objects*/
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A{
	public static void main(String[] args){
		Employee employee = new Employee("Narendra",50,new EmployeeAddress(new EmployeeCity("Jabalpur"),new EmployeeState("MP"),"482001"));
		Student student = new Student("Rahul",50,new Address(new City("Kanpur"),new State("UP"),"482002"));
		
		try{
			File file = new File("a/a1/a2/a3");
			file.mkdirs();
			File f1 = new File(file,"abc.txt");
			FileOutputStream fos = new FileOutputStream(f1);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			oos.writeObject(student);
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	} 
}