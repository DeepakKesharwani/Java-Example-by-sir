import java.text.*;
import java.util.*;

class S 
{
	public static void main(String[] args) 
	{
		float f1 = 123.4564878999f;

		NumberFormat nf = NumberFormat.getInstance();

		//System.out.println(nf.getMaximumFractionDigits() + " ");
		
		
		//System.out.println(nf.format(f1) + " ");
		
		nf.setMaximumFractionDigits(5);
		
		System.out.println(nf.format(f1) + " ");		
		
		
		/*try {
			//System.out.println(nf.parse("1234.567"));
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse("1234.56778"));
		} catch (ParseException pe) {
			System.out.println("parse exc");
		}*/	
	}
}
