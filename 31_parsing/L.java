import java.util.regex.*;

class L{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("\\s"); // the expression

		Matcher m = p.matcher("ab \n 23a \tb8\f \ra"); // the source

		System.out.println("ab \\n 23a \\tb8\\f \\ra\n=============");
		while(m.find()) {
			System.out.println(m.start() + "  >"+m.group()+"<");
		}		
		
		//Case 2:
		//System.out.println("mohan\rkum");
	}
}