import java.util.regex.*;

class J 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("\\d[^abt]");

		Matcher m = p.matcher("1a2r4t7c5b");
		
		System.out.println("1a2r4t7c5b");
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
