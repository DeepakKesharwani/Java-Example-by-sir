/*
  Transient keyword :

  1) Here we disscuss the concept about the use of transient keyword.

  2) The use of transient keyword is to skip the member variable.
  
  3)If we have only the .class file so we can not able to implement the Serializable
	in the class so by marking the transient to member variable we can handle the 
	exception generated java.io.NotSerializableException.

  4)Transient member on deserialization initialized by default values.

  5)On accessing the transient member we get the NullPointerException.

*/
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A 
{
	public static void main(String[] args){
		City city = new City();
		city.cityName = "Bhopal";
		State state = new State();
		state.stateName = "MP";

		Address addr = new Address();
		addr.city = city;
		addr.state = state;

		Student s = new Student();
		s.name = "Ganesh";
		s.age = 12;
		s.address = addr;

		try{
			FileOutputStream fos = new FileOutputStream("yogi.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}