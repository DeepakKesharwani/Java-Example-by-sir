import java.util.regex.*;

class F 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[aNuxz]");

		Matcher m = p.matcher("aNunUzNA");
		
		System.out.println("aNunUzNA\n==========");
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
