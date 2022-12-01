import java.util.regex.*;

class C 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile(".*?xx"); //Try reluctant ".*?xx"

		Matcher m = p.matcher("_2a3xx#exx");
		
		System.out.println("_2a3xx#exx  \n=========");
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
