import java.util.Calendar;
import java.util.Date;

class E 
{
	public static void main(String[] args) 
	{		
		Calendar cal = Calendar.getInstance();
		Date dt = new Date(cal.getTimeInMillis());
		System.out.println(dt);		
	
		//Case 1:
		//cal.add(Calendar.MONTH,12);
		//cal.roll(Calendar.MONTH,11);
		//dt = new Date(cal.getTimeInMillis());
		//System.out.println(dt);
		
		//Case 2:		
		//cal.add(Calendar.MONTH,6);				
		//cal.roll(Calendar.DATE,32);
		cal.add(Calendar.MONTH,1);
		dt = new Date(cal.getTimeInMillis());
		System.out.println(dt);			
	}
}
