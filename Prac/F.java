import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class F{
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

		//System.out.println(str);
		Pattern	p = Pattern.compile(">(.*?)</a>");	
		Matcher m = p.matcher(str);
		
		int count = 0;
		while(m.find()){
			String s = m.group();

			if(count%2!=0){
				System.out.println(s.substring(1,s.length()-4)+"\n\n");				
			}
			count++;
		}
	}
}





