import java.io.*;

class B{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("chidambaram.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Q r = (Q)ois.readObject();
		
			System.out.println(r.g);
			System.out.println(r.student);
			System.out.println(r.y);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}	
	}
}