import java.util.regex.*;

class M 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("a.c");

		Matcher m = p.matcher("ac abc a c");
		
		System.out.println("ac abc a c\n============\n");
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
