import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Serializable;

class C
{
	public static void main(String[] args){
		try{
			City ct = new City();
			ct.cityName = "Jabalpur";

			State st = new State();
			st.stateName = "MP";

			Address addr = new Address();
			addr.city = ct;
			addr.state = st;

			Student x = new Student();
			x.name = "mohan";
			x.age = 12;
			x.address = addr;
			
			File file = new File("modi.txt");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(x);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

class Student implements Serializable{
	String name;
	int age;
	Address address;
}
class Address implements Serializable{
	City city;
	State state;
}
class City implements Serializable{
	String cityName;
}
class State implements Serializable{
	String stateName;
}