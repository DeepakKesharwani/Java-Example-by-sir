import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ClassNotFoundException;

class B{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("pqr.txt");
			ObjectInputStream oos = new ObjectInputStream(fis);
			R r = (R)oos.readObject();

			System.out.println(r.s);

			System.out.println(r.student);
			System.out.println(r.student.name);
			System.out.println(r.student.age);
			System.out.println(r.f);
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