import java.util.regex.*; 

class P 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[a-e]");
		Matcher m = p.matcher("ab23 df2 r127c w1 4ab223 4a67");
		
		while(m.find()){
			System.out.println(m.start()+" - "+m.end()+" - "+m.group());
		}
	}
}
