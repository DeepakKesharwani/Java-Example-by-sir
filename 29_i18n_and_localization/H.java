import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

class H 
{
	public static void main(String[] args) 
	{	
		Locale lc = new Locale("de","DE");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,lc);
		
		Date dt = new Date();
		System.out.println(df.format(dt));			
	}
}
