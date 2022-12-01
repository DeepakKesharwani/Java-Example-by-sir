import java.util.regex.*;

class K{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("aaa"); // the expression

		Matcher m = p.matcher("aaaaaa"); // the source

		while(m.find()) {
			System.out.print(m.start() + " " +m.end()+ " " +m.group()+"\n");
		}		
	}
}