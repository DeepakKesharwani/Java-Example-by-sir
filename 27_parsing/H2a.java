import java.util.regex.*;

class H2a 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("0[xX]([0-9a-fA-F])*"); //also try * and ?

		Matcher m = p.matcher("34 0x 0x6a 0XFA234 0xn");
		
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
