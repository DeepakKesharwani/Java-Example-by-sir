import java.util.regex.*; 

class I 
{
	public static void main(String[] args) 
	{		
		Pattern p = Pattern.compile("\\d\\d\\d");
		Matcher m = p.matcher("ab232 df2 r137x w1 453 4t67");

		while(m.find()){
			System.out.println(m.start()+" - "+m.end()+" - "+m.group());	
		}		
	}
}


//IllegalStateException