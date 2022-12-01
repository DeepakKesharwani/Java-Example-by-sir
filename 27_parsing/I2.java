import java.util.regex.*;

class I2 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("0[xX]([0-9a-fA-F])?");

		Matcher m = p.matcher("34 0x 0x6ad 0XF 0xn");
		
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
