import java.util.regex.*; 

class J 
{
	public static void main(String[] args) 
	{		
		Pattern p = Pattern.compile("aba");
		Matcher m = p.matcher("abababa");

		while(m.find()){
			System.out.println(m.start()+" - "+m.end()+" - "+m.group());	
		}		
	}
}


