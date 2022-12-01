import java.io.*;

class X{
	public static void main(String[] args){
		A a = new A();

		a.x = 78;
		a.y = 1;

		try{
			FileOutputStream fos = new FileOutputStream("kohli.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(a);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}