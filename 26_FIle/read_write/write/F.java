import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class F{
	public static void main(String[] args){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("ganesh.txt")));

			bw.write("suresh is a good boy");
			bw.newLine();
			bw.write("he is in class 8th");

			bw.flush();
			bw.close();
		}catch(IOException e){	
			e.printStackTrace();
		}
	}
}