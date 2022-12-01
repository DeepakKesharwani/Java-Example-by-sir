import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class C
{
	public static void main(String... args) throws IOException{
		FileReader fr new FileReader("abc.html");
		int ch = 0;
		String str = " ";
		while((ch=fr.read())!=-1){
			str +=(char)ch;
		
		}
		System.out.println(str);
	}
}