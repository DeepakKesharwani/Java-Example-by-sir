import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException ;
class E{
	public static void main(String[] args){
		try{
			//File file = new File("a/a1/a2/a3/who.txt");
			File file = new File("b/b2/b3/b4/b5");
			file.mkdirs();
			//file = new File("a/a1/a2/a3/who.txt/A.txt");
			file = new File("b/b2/b3/b4/b5/A.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			//case1
			
			bw.write('A');
			bw.write('A');
			bw.write('A');
			bw.write('A');
			bw.write('A');
			bw.write('A');
			bw.write('A');
			bw.write('A');
			bw.write('A');
			bw.write('A');
			bw.flush();
			bw.close();
			
			//case 2:
			/*char[] ch ={'m','o','h','a','n'}; 
			while(!(ch == -1)){
				bw.write();
			}*/
		}catch(FileNotFoundException  e){
			e.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
}