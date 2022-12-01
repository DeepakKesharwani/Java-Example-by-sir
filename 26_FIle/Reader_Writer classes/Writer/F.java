import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class F
{
	public static void main(String[] args){
		char[] c = {'P','L','A','C','E','B','O',' ','E','F','F','E','C','T','S'};
		
		try{
			//BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Aim")));
			//BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Aim.txt")));
			//BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Goal.txt")));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Edutainment.txt")));
			//bw.write(c,8,7);
			//bw.write(c,0,7);
			bw.write(c);

			bw.flush();
			bw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	
	}
}
