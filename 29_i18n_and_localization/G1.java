import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class G1 {
	public static void main(String[] args) {
		Locale loc = new Locale("fr","FR");
		Calendar cal = Calendar.getInstance(loc);
		Date dt = new Date(cal.getTimeInMillis());
		System.out.println(dt);		
	}
}
