import java.util.*;
import java.text.*;

class F2 
{
	public static void main(String[] args) 
	{
		//Case 1:
		DateFormat df = DateFormat.getInstance();

		//Case 2:		
		//DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		
		try{
			//Case 1:
			//Date dt = df.parse("Jan 12, 1952");
			//System.out.println(dt);
			//DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
			//System.out.println(df1.format(dt));
			
			//Case 2:
			Date dt = df.parse("08/09/2018");			
			System.out.println(dt);
		}catch (ParseException e){
			e.printStackTrace();
		}		
	}
}
