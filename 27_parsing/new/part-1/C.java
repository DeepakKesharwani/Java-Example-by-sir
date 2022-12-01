import java.util.regex.*; 

class C
{		
	public static void main(String[] args){
		//Case 1:
		/*
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");		
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		*/

		//Case 2:
		/*
		Pattern p = Pattern.compile("mohan");
		//Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");		
		Matcher m = p.matcher("mohan");		
		System.out.println(m.matches());
		System.out.println(m.matches());
		*/

		//Case 3:
		/*
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");				
		System.out.println(m.lookingAt());
		System.out.println(m.lookingAt());
		System.out.println(m.lookingAt());
		System.out.println(m.lookingAt());
		*/
	}
}

