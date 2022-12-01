import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ClassNotFoundException;

class B
{
	public static void main(String[] args){
		try
		{
			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream oos = new ObjectInputStream(fis);
			W x = (W)oos.readObject();
			System.out.println(x.g);

			System.out.println(x.s);
			System.out.println(x.y);			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}