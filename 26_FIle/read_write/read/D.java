import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class D{
	public static void main(String[] args){
		File file = new File("abc.txt");
		
		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			System.out.println(br.readLine());

		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
}