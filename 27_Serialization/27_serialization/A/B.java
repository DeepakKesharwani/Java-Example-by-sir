import java.io.*;

class B{
	public static void main(String[] args){
		File file = new File("rahul.txt");

		try{
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			X x = (X)ois.readObject();

			System.out.println(x.a);
			System.out.println(x.g);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}