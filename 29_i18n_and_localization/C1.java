import java.util.Calendar;
import java.util.Date;

class C1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();		
		Date dt = new Date(cal.getTimeInMillis());
		System.out.println(dt);

		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

	}
}
