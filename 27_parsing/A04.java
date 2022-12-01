import java.util.regex.*;

class A04{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("abc"); // the expression

		Matcher m = p.matcher("abcaaabcdfrt"); // the source		
		
		System.out.println(p.pattern());
		System.out.println(m.pattern());

	}
}