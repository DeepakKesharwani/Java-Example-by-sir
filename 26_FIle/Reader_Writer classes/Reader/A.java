import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class A
{
	public static void main(String... args){
		try{
			//File f = new File("Shubhi.txt");
			File f1 = new File("Deepika.txt");
			FileReader fr = new FileReader(f1);
			//case 1:
			
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			

			//Case 2:
			/*
			int c = 0;
			while((c=fr.read())!=-1){
				System.out.print((char)c);
			}
			*/
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}