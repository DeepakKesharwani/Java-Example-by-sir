import java.util.regex.*;

class A02{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("abc"); // the expression

		Matcher m = p.matcher("abcaaabcdfrt"); // the source
		

		//Case 1:
		//m.find();
		//System.out.println("Start Index: "+m.start());
		//System.out.println("Start Index: "+m.end());

		//Case 2:
		/*
		m.find();
		System.out.println("Start Index: "+m.start());
		m.find();
		System.out.println("Start Index: "+m.start());
		m.find();
		System.out.println("Start Index: "+m.start());
		*/

		//Case 2a:
		//System.out.println("Start Index: "+m.start());
		
		//Case 3:
		
		int count = 0;
		while(m.find()){
			count++;
			System.out.println("Start Index: "+m.start());
		}
		System.out.println("----------\n "+count);	
		
	}
}