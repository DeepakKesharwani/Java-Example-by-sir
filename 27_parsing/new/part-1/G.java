import java.util.regex.*; 

class G 
{
	public static void main(String[] args) 
	{
		//Pattern p = Pattern.compile("\\d\\d\\d");
		Pattern p = Pattern.compile("[0-9][0-9][0-9]");
		Matcher m = p.matcher("ab23 df2 r127x w1 857423 4t67");

		System.out.println(m.find()+" - "+m.start()+" - "+m.end()+" - "+m.group());
		System.out.println(m.find()+" - "+m.start()+" - "+m.end()+" - "+m.group());
		System.out.println(m.find()+" - "+m.start()+" - "+m.end()+" - "+m.group());
		System.out.println(m.find()+" - "+m.start()+" - "+m.end()+" - "+m.group());
	}
}
