import java.io.*;

class A{
	public static void main(String[] args){
		Address addr = new Address();
		addr.cityName = "Ahmdabad";
		addr.stateName = "Gujrat";
		
		Student s = new Student();
		s.name = "vidyut";
		s.age = 23;
		s.address = addr;
		
		try{
			FileOutputStream fos = new FileOutputStream("mamta.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(s);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}