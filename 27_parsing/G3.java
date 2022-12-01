import java.util.regex.*;

class G3 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[a-f[e-s[p-u]]]"); //[a-fe-sp-u]

		Matcher m = p.matcher("a2dfer3tv2");
		
		System.out.println("a2dfer3tv2");
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
