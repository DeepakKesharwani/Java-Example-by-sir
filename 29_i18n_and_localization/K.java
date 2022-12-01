import java.util.*;

class K 
{
	public static void main(String[] args) 
	{
		Locale l = new Locale("fr","FR");
		Calendar cal = Calendar.getInstance(l);
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.getTime());
		//System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
}
