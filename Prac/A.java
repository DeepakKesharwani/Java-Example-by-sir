import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class A{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("abc.html");

		int ch = 0;
	
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
		}
	}
}