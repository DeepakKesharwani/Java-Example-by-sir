import java.io.*;
import java.util.Date;

class A{
	public static void main(String[] args){

		Q q = new Q();
		q.g = 12.4567f;
		q.student = new Student("dinesh", 23);
		q.y = 87;

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



