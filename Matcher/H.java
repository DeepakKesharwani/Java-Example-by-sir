import java.util.regex.*; 

class H 
{
	public static void main(String[] args) 
	{
		//Case 1:
		/*
		Pattern p = Pattern.compile("\\d\\d\\d");
		Matcher m = p.matcher("ab23 df2 r127x w1 457223 4t67");

		//System.out.println(m.start());
		//System.out.println(m.end());
		//System.out.println(m.group());
		
		*/


		//Case 2:
		
		Pattern p = Pattern.compile("\\d\\d\\d");
		Matcher m = p.matcher("ab23 df2 r17x w1 4 3 4t67");

		System.out.println(m.find());

		System.out.println(m.start());
		System.out.println(m.end());
		System.out.println(m.group());
	
	}
}


//IllegalStateException