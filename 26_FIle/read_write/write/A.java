import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class A{
	public static void main(String[] args){
		File file = new File("xyz.txt");

		try{
			file.createNewFile();

			FileWriter fw = new FileWriter(file);

			fw.write('A');
			fw.write('\n');
			fw.write('B');
			fw.write('Z');

			fw.flush();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}