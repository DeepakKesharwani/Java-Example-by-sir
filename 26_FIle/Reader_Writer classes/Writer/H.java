import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

class H
{
	public static void main(String[] args){
		PrintWriter pw = null;

		try{
			pw = new PrintWriter(new File("Divya.txt"));
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}

		pw.print("Hello");
		pw.println(" how are you!");
		pw.print('F');
		pw.append("ine");

		pw.flush();
		pw.close();
	}
}