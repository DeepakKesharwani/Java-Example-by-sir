import java.util.regex.*;

class G 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[a-iS-Z]");

		Matcher m = p.matcher("auThscrxYb");
		
		System.out.println("auThscrxYb++++++\n");
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
