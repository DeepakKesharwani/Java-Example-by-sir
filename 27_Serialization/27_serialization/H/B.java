import java.io.*;

class B{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("sachho.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Student student = (Student)ois.readObject();
			System.out.println(student.name);
			System.out.println(student.age);
			System.out.println(student.address.city.cityName);
			System.out.println(student.address.state.stateName);
			System.out.println(student.address.pinCode);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}