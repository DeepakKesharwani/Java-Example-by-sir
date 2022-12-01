import java.util.regex.*;

class N{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("\\w\\s"); // the expression

		Matcher m = p.matcher("a % b _8 $"); // the source

		System.out.println("a % b _8 $\n============");
		while(m.find()) {
			System.out.println(m.start() + " >"+m.group()+"<");
		}		
	}
}