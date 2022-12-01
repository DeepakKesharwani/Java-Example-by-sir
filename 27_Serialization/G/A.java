import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A{
	public static void main(String[] args){
		try{
			FileOutputStream fos = new FileOutputStream("modi.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}