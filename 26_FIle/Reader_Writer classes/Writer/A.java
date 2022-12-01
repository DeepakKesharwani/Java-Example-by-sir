import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class A
{
	public static void main(String[] args){
		try{
			File f = new File("abc.txt");
			FileWriter fr = new FileWriter(f);
			fr.write("A");
			fr.write("B");
			fr.write("C");
			fr.write("D");

			fr.flush();
			fr.close();
		}catch(IOException e){
			e.printStackTrace();

		}
	
	}
}