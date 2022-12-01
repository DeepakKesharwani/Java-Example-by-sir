import java.util.regex.*;

class A03{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("abc"); // the expression

		Matcher m = p.matcher("abcaaabcdfrte"); // the source
		
		
		//Case 1:
		System.out.println("Pattern Obj.: "+p);
		System.out.println("Matcher Obj.: "+m);

		
		m.find();
		System.out.println("Matcher Obj.: "+m);	

		m.find();
		System.out.println("Matcher Obj.: "+m);	
		
	}
}