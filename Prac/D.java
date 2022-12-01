import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class D{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("abc.html");

		int ch = 0;
		String str = "";

		while((ch=fr.read())!=-1){
			str += (char)ch;
		}

		str = str.split("<ul class=\"fv-list\">")[1];
		//str = str.substring(0,str.indexof("</ul>"));
		str = str.split("</ul>")[0];

		System.out.println(str);

	}
}