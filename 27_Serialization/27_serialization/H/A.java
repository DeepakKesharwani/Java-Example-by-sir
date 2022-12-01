import java.io.*;

class A{
	public static void main(String[] args){
		
		Student student = new Student("ratnesh", 23, new Address(new City("kanpur"),new State("UP"),345678));		
	
		try{
			FileOutputStream fos = new FileOutputStream("sachho.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(student);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}