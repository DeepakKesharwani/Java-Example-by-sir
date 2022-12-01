import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

class Q 
{
	public static void main(String[] args) 
	{
		Date d2 = new Date();

		Locale locBR = new Locale("pt", "BR"); // Brazil
		Locale locDK = new Locale("da", "DK"); // Denmark
		Locale locIT = new Locale("it", "IT"); // Italy
		
		//System.out.println(locBR.getDisplayCountry());
		//System.out.println(locBR.getDisplayCountry(locBR));
		//System.out.println(locDK.getDisplayLanguage());
		//System.out.println(locDK.getDisplayLanguage(locDK));
		System.out.println(locDK.getDisplayLanguage(locIT));		
	}
}
