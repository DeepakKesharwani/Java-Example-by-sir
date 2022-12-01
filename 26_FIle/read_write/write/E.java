import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class E{
	public static void main(String[] args){
		File file = new File("pqr.txt");

		try{
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write('W');
			bw.newLine();
			bw.write('E');
			bw.write('J');

			bw.flush();
			bw.close();
		}catch(IOException e){	
			e.printStackTrace();
		}
	}
}