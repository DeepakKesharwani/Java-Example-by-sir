import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ClassNotFoundException;

class B
{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Q r = (Q)ois.readObject();
			System.out.println(r.y);
			System.out.println(r.d);
			System.out.println(r.k);

		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	
	}
}