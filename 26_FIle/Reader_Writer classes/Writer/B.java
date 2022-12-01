import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class B
{
	public static void main(String[] args){
		try{
			FileWriter fr = new FileWriter(new File("kkr"));
			fr.write('A');
			fr.write('N');
			fr.write('T');
			fr.write('I');
			fr.write('B');
			fr.write('I');
			fr.write('O');
			fr.write('T');
			fr.write('I');
			fr.write('C');
			fr.write('S');

			fr.flush();
			fr.write(" ");
			fr.write('M');
			fr.write('E');
			fr.write('D');
			fr.write('I');
			fr.write('C');
			fr.write('I');
			fr.write('N');
			fr.write('E');
			fr.write('S');

			fr.flush();

			fr.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}