import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class G
{
	public static void main(String[] args){
		try{
			//BufferedWriter br = new BufferedWriter(new FileWriter("dell.txt"));
			BufferedWriter br = new BufferedWriter(new FileWriter("Great.txt"));

			br.write("I am the Best Software Engineer.");
			br.newLine();
			br.write("IF you focus on the goal you lose the problem.");
			br.newLine();
			br.write("If you focus on the problem you lose the goal.");
			br.flush();
			br.newLine();
			br.write("Consistency");
			br.newLine();
			br.write("Continuity");
			br.newLine();
			br.write("Complete");

			br.flush();
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}