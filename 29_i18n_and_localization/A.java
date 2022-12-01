import java.util.Date;
/* Israel Daylight Time (IDT) is 3 hours ahead of Coordinated Universal Time (UTC). 
This time zone is a Daylight Saving Time time zone and is used in: Asia.*/
class A {
	public static void main(String[] args) {
		Date dt = new Date(-887894358395L);
		Date dt1 = new Date(887894358395L);
		System.out.println(dt);
		System.out.println(dt1);
		System.out.println(dt.toString());
		System.out.println(dt1.toString());
	}
}
