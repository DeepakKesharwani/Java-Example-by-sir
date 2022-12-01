import java.text.SimpleDateFormat;
import java.util.Date;
class U 
{
	public static void main(String[] args) 
	{
		SimpleDateFormat sd = new SimpleDateFormat("EEE, MMMM - yyyy - dd : hh:mm:ss a k");
		Date dt = new Date();

		String fdt = sd.format(dt);
		System.out.println(fdt);
	}
}
