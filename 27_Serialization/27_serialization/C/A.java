import java.io.*;

class A{
	public static void main(String[] args){
		City ct = new City();
		ct.cityName = "Bhopal";

		State st = new State();
		st.stateName = "MP";

		Address addr = new Address();
		addr.city = ct;
		addr.state = st;

		Student s = new Student();
		s.name = "Vikram";
		s.age = 23;
		s.address = addr;
		s.flag = true;

		try{
			FileOutputStream fos = new FileOutputStream("chidambaram.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(s);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}



