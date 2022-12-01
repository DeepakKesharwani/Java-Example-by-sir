import java.io.*;
import java.util.Date;

class A{
	public static void main(String[] args){

		Q q = new Q();
		q.g = 7.8f;
		q.m = 'w';

		q.a = 57;
		q.flag = true;
		q.date = new Date();

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



