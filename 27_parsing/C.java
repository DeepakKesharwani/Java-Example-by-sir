import java.util.regex.*;

class C{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("\\d\\d"); // the expression
		
		System.out.println(p);
		
		Matcher m = p.matcher("ab23ab8ab890a"); // the source

		System.out.println("ab23ab8ab890a\n=============");
		while(m.find()) {
			System.out.println(m.group()+"\n"+m+"\n\n");
		}		
	}
}