import java.util.regex.*;

class K 
{
	public static void main(String[] args) 
	{
		//Pattern p = Pattern.compile("proj1[^,]*");		
				
		//Pattern p = Pattern.compile("proj1([^,])*\\.([^,])+");
		
		Pattern p = Pattern.compile("([^,])+\\.([^,])+");

		Matcher m = p.matcher("proj3.txt,proj1sched.pdf,proj11,proj2,proj1.java");
		
		System.out.println("proj3.txt,proj1sched.pdf,proj11,proj2,proj1.java");
		while(m.find()){
			System.out.println(m.start()+" - "+m.group());
		}		
	}
}
