import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class C
{
	public static void main(String[] args){
		try{
			FileWriter fr = new FileWriter("rcb.txt");
			BufferedWriter br = new BufferedWriter(fr);

			br.write('P');
			br.write('L');
			br.write('A');
			br.write('C');
			br.write('E');
			br.write('B');
			br.write('O');

			br.flush();
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}