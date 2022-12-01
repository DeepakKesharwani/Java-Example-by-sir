import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Serializable;

class X implements Serializable{
	int a;
	float g;
}

class A{
	public static void main(String[] args){
		X x = new X();
		x.a = 34;
		x.g = 5.67f;

		File file = new File("rahul.txt");

		try{
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(x);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}