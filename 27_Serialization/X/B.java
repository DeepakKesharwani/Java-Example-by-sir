/* Here we discuss about how we can serialize multiple object and deserialize multiple
	object from one txt file.
*/
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ClassNotFoundException;

class B{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e = (Employee)ois.readObject();
			System.out.println(e.employeeName);
			System.out.println(e.employeeAge);
			System.out.println(e.employeeAddress);
			System.out.println(e.employeeAddress.employeeCity.cityName);
			System.out.println(e.employeeAddress.employeeState.stateName);
			System.out.println(e.employeeAddress.pinCode);
			
			System.out.println("#######################################");

			Student s = (Student)ois.readObject();
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.address);
			System.out.println(s.address.city.cityName);
			System.out.println(s.address.state.stateName);
			System.out.println(s.address.pinCode);

		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}