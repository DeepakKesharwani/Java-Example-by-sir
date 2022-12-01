import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class C{
	public static void main(String[] args){
		char[] arr = {'A','m','i','t'};

		try{
			FileWriter fw = new FileWriter("ganesh.txt");

			fw.write(arr);

			fw.flush();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}