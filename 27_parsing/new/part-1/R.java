import java.util.regex.*; 

class R 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[^abc]");
		//Pattern p = Pattern.compile("[^abc0-9]");
		Matcher m = p.matcher("ab23 df2 r127c w1 4at223 4U67");
		
		while(m.find()){
			System.out.println(m.start()+" - "+m.end()+" - "+m.group());
		}
	}
}
