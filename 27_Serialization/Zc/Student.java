import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

class Student implements Serializable{
	String name;
	int age;
	transient Address address;

	Student(){
	
	}
	
	Student(String name,int age,Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}

	private void writeObject(ObjectOutputStream oos)throws IOException{	
			oos.defaultWriteObject();
			oos.writeObject(address.city.cityName);
			oos.writeObject(address.state.stateName);
			oos.writeObject(address.pinCode);	
	}

	private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException {	
			ois.defaultReadObject();
			address = new Address();
			address.city = new City((String)ois.readObject());
			address.state = new State((String)ois.readObject());
			address.pinCode = (String)ois.readObject();
	}
}