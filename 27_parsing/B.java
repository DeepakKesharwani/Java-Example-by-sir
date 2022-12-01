import java.util.regex.*;

class B{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("aba"); // the expression

		Matcher m = p.matcher("abababa"); // the source

		while(m.find()) {
			System.out.print(m.start()+" - "+ m.end()+ " - "+ m.group()+ "\n");
		}		
	}
}