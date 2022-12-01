import java.io.*;

class Y{
	public static void main(String[] args){
		A a = new A();

		a.x = 77;
		a.y = 2;

		try{
			FileOutputStream fos = new FileOutputStream("dhoni.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(a);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}