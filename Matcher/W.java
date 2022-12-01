import java.util.regex.*;

class W
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[a-z][^0-9]");

		Matcher m = p.matcher("a2dfer3tg2");
		
		System.out.println("a2dfer3tg2");
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
