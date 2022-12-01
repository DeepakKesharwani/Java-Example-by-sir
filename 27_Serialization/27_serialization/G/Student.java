import java.io.*;

class Student implements Serializable{
	String name;
	int age;
	transient Address address;

	private void readObject(ObjectInputStream ois){
		try{
			ois.defaultReadObject();
			address = new Address();
			address.cityName = (String)ois.readObject();
			address.stateName = (String)ois.readObject();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	
	private void writeObject(ObjectOutputStream oos){		
		try{
			oos.defaultWriteObject();
			oos.writeObject(address.cityName);
			oos.writeObject(address.stateName);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}





