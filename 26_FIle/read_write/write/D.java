import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class D{
	public static void main(String[] args){
		char[] arr = {'A','m','i','t',' ','i','s',' ','a',' ','g','o','o','d',' ','b','o','y'};

		try{
			FileWriter fw = new FileWriter("suresh.txt");

			fw.write(arr,5,9);

			fw.flush();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}