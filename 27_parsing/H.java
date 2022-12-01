import java.util.regex.*;

class H 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("0[xX][0-9a-fA-F]");

		Matcher m = p.matcher("34 0x 0x6a 0XF2 0xn");

		System.out.println("34 0x 0x6a 0XF2 0xn");
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
			//System.out.println(m+"\n");
		}		
	}
}
