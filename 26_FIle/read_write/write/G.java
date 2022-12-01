import java.io.*;

class G{
	public static void main(String[] args){
		File f = new File("modi.txt");

		PrintWriter pw = null;

		try{
			pw = new PrintWriter(f);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}		

		pw.print(true);
		pw.println(12.56);
		pw.print('G');

		pw.flush();
		pw.close();
	}
}