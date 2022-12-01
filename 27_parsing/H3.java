import java.util.regex.*;

class H3{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("^[A-Z][a-z][a-z]$"); // the expression

		Matcher m = p.matcher("Ram"); // the source
		
		while(m.find()) {
			System.out.println(m.start() + " "+m.group()+" ---");
		}

		System.out.println("+++");
	}
}