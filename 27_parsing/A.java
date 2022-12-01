import java.util.regex.*;

class A{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("abc"); // the expression

		Matcher m = p.matcher("abcaaabcdfrt"); // the source
		
		while(m.find()) {
			System.out.print("Start Index: "+m.start() + " & the End Index: ");
			System.out.println(m.end() + " ");
		}		
	}
}