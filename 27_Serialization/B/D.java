import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.lang.ClassNotFoundException;
import java.io.Serializable;

class D
{
	public static void main(String[] args){
		try{
			File file = new File("modi.txt");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student)ois.readObject();
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.address);
			System.out.println(s.address.city);
			System.out.println(s.address.city.cityName);
			System.out.println(s.address.state);
			System.out.println(s.address.state.stateName);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}