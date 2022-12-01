import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("modi.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ois.readObject();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}