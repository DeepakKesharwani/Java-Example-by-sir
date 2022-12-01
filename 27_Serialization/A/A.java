// Here coding is for Serialization which means Saving the object in file or convert 
//  class object into file.

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Serializable;

class X implements Serializable{
	int a;
	float b;
	String s;
}
class A{
	public static void main(String[] args){
		try{
			X x = new X();
			x.a = 23;
			x.b = 34.56f;
			x.s = "My name is Deepak kumar kesharwani..";
			File file = new File("Good.txt");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream ois = new ObjectOutputStream(fos);
			ois.writeObject(x);
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	
	}
}