import java.io.*;

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

	private void writeObject(ObjectOutputStream oos){
		try{
			oos.defaultWriteObject();
			oos.writeObject(address.city.cityName);
			oos.writeObject(address.state.stateName);
			oos.writeObject(address.pinCode);	
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream ois){
		try{
			ois.defaultReadObject();
			address = new Address();
			address.city = new City((String)ois.readObject());
			address.state = new State((String)ois.readObject());
			address.pinCode = (String)ois.readObject();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}