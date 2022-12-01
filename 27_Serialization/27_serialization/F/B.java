import java.io.*;

class B{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("chidambaram.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Q q = (Q)ois.readObject();

			System.out.println(q.t);
			System.out.println(q.student.name);
			System.out.println(q.student.age);
			System.out.println(q.y);

			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}	
	}
}