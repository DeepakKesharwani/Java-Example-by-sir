import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class B{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("mohan.txt");

			fw.write("mohan");
			fw.write("kumar");
			fw.write("singh");

			fw.flush();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}