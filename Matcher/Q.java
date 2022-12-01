import java.util.regex.*; 

class Q 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[a-cs-z]");
		Matcher m = p.matcher("ab23 df2 r127c w1 4at223 4U67");
		System.out.println("ab23 df2 r127c w1 4at223 4U67");
		while(m.find()){
			System.out.println(m.start()+" - "+m.end()+" - "+m.group());
		}
	}
}