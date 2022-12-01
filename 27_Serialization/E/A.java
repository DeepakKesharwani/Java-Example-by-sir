import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A
{
	public static void main(String[] args){
		R k = new R();
		k.s = 23.43f;
		k.student = new Student("Modi",21);
		k.f=28;
		try{
			FileOutputStream fos = new FileOutputStream("pqr.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(k);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}