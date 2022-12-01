import java.util.regex.*;

class L 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("\\d\\d\\d([-\\s])?\\d\\d\\d\\d");

		Matcher m = p.matcher("1234567 asa,123 4567 yusaui123-456745,asd,123-4567");
		
		while(m.find()){
			System.out.println(m.start()+" - "+m.group()+"<");
		}		
	}
}
