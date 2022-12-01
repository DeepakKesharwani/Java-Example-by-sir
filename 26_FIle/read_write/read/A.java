import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class A{
	public static void main(String[] args){
		try{
			FileReader fr = new FileReader(new File("mohan.txt"));
			
			//Case 2:
			//int c = 0;
			//while((c=fr.read())!=-1){
			//	System.out.print((char)c);
			//}

			//Case 1:
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			
			fr.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}