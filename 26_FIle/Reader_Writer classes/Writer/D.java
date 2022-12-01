import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException ;
class D{
	public static void main(String[] args){
		try{
			File f = new File("a/a1/a2/a3/who.txt");
			Boolean b = f.mkdirs();
			String str = Boolean.toString(b);
			//File file = new File(str,"xyz.txt");
			FileWriter fw = new FileWriter(str);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write('A');
			bw.write('A');
			bw.write('A');
			bw.flush();
			bw.close();
		}catch(FileNotFoundException  e){
			e.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
}