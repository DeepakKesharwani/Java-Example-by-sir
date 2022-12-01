// Here coding is for Deserialization which means file/text convert into class object..

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.ClassNotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;

class B{
	public static void main(String[] args){
		try{
			File file = new File("Good.txt");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			X x = (X)ois.readObject();
			
			System.out.println(x.a);
			System.out.println(x.b);
			System.out.println(x.s);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}