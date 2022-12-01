import java.util.regex.*;

class X 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[a-f[e-s[p-u]]]"); //[a-fe-sp-u]

		Matcher m = p.matcher("a2dvfeyr3tg2");
		
		System.out.println("a2dvfeyr3tg2");
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
