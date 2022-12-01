import java.io.*;

class C{
	public static void main(String[] args){
		City city = new City();
		city.cityName = "Jabalpur";

		State state = new State();
		state.stateName = "MP";

		Address addr = new Address();
		addr.city = city;
		addr.state = state;

		Student s = new Student();
		s.name = "ganesh";
		s.age = 14;
		s.address = addr;

		File file = new File("kejri.txt");

		try{
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(s);
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