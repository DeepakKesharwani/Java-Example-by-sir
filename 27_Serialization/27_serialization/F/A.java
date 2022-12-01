import java.io.*;
import java.util.Date;

class A{
	public static void main(String[] args){
		
		Q q = new Q();
		q.t = 19;
		q.student = new Student("sarvesh",45);
		q.y = 21;
		

		try{
			FileOutputStream fos = new FileOutputStream("chidambaram.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(q);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}



