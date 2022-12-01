import java.util.Calendar;
import java.util.Date;

class C {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		System.out.println("\n");
		
		Date dt = new Date(cal.getTimeInMillis());
		System.out.println(dt);
	}
}
