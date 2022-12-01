import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ClassNotFoundException;

class B
{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("yogi.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student x = (Student)ois.readObject();
			System.out.println(x.name);
			System.out.println(x.age);
			System.out.println(x.address);
			//System.out.println(x.address.city.cityName);
			//System.out.println(x.address.state.stateName);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	
	}
}