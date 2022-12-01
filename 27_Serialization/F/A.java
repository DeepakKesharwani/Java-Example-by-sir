import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.Date;

class A{
	public static void main(String[] args){
		W d = new W();
		d.g =12.6789f;

		d.s = new Student("Ganesh",23);
		d.y =25;

		try{
			FileOutputStream fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}