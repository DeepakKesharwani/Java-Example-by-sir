import java.io.*;

class Z{
	public static void main(String[] args){
		try{
			FileInputStream fis1 = new FileInputStream("kohli.txt");
			ObjectInputStream ois1 = new ObjectInputStream(fis1);

			A a1 = (A)ois1.readObject();
			System.out.println(a1.x+" ~ "+a1.y);

			FileInputStream fis2 = new FileInputStream("dhoni.txt");
			ObjectInputStream ois2 = new ObjectInputStream(fis2);

			A a2 = (A)ois2.readObject();
			System.out.println(a2.x+" ~ "+a2.y);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}	
}