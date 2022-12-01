import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A
{
	
	public static void main(String[] args){
		Q s = new Q();
		s.y = 12;
		s.d = true;
		s.k = 2.34f;
		try{
			FileOutputStream fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}