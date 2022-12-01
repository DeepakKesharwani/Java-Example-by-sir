//-----------
import java.util.regex.*;

class A0{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("abc"); // the expression

		Matcher m = p.matcher("abcaaabcdfrt"); // the source
		
		//System.out.println(p);
		//System.out.println(m);
		
		//System.out.println(m);
		//System.out.println("+++++++++++++++++++");
		System.out.println(m.find());
		System.out.println(m.start()+" - "+m.end()+" - "+m);
		
		
		System.out.println(m.find());
		System.out.println(m.start()+" - "+m.end()+" - "+m);

		
		System.out.println(m.find());
		System.out.println("+++++++++++++++++++"+m);
		System.out.println(m.start()+" - "+m.end()+" - "+m);
		
	}
}