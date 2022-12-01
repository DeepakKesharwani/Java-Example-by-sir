import java.util.*;

class E1 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		
		//System.out.println(cal.get(Calendar.DATE));
		//System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		//System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		//System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//System.out.println(cal.get(Calendar.ERA));
		System.out.println(cal.getFirstDayOfWeek());
		//System.out.println((Calendar.SUNDAY==cal.getFirstDayOfWeek())+" ----First Day Of Week: "+cal.getFirstDayOfWeek()); 

		//cal.set(2015, 0, 14);
		//System.out.println(new Date(cal.getTimeInMillis()));
	}
}
