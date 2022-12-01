import java.util.regex.*;

class N 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile(".*?xx"); //Try reluctant ".*?xx"

		Matcher m = p.matcher("_2a3xx#exxx");
		
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
