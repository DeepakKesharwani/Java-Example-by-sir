import java.io.Serializable;

class Student implements Serializable{
	String name;
	int age;
	transient Address address;

	public void readObject(ObjectInputStream ois){
		try{
			ois.defaultReadObject();
			address = new Address();
			address.cityName = (String)ois.readObject();
			address.stateN
		}
		catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	
	}

	public void writeObject(ObjectOutputStream oos){
		try{
			oos.defaultWriteObject();
			oos.writeObject(address.stateName);
			oos.writeObject(address.cityName);
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
	
	
	}
}