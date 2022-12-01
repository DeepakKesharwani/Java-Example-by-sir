import java.util.regex.*; 

class T 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[a-f&&[c-z]]");
		Matcher m = p.matcher("ab23 df2 r127c w1 4at223 4e67");
		
		while(m.find()){
			System.out.println(m.start()+" - "+m.end()+" - "+m.group());
		}
	}
}
