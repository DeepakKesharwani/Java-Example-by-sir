//--------

import java.util.regex.*;

class A01{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("abc"); // the expression

		Matcher m = p.matcher("abc"); // the source
		
		System.out.println(m.matches());
		System.out.println(m.matches());
		System.out.println(m.matches());
		System.out.println(m.matches());

		System.out.println("Start Index: "+m.start());
		//System.out.println("Start Index: "+m.end());
	}
}