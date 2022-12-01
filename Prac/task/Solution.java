import java.util.regex.*;
public class Solution{
	static void emailCheck(String s,String t){
		System.out.println(s);
		System.out.println(t);
		//Pattern p = Pattern.compile("@gmail.com");
		Pattern p = Pattern.compile("@yahoo.com");
		Matcher m = p.matcher(s+t);
		//Boolean x = m.find();
		//System.out.println(x);
		//int x = m.end();
		if(m.find()){
			//return m.find() ;
			System.out.println(m.find());

		}
		else{
			//return false ;
			System.out.println(m.find());

		}
		
	}

	public static void main(String[] args){
		Customer e1 = new Customer(1,"abc","abc@gmail.com");
		Customer e2 = new Customer(2,"xyz","xyz@gmail.com");
		String x = e1.email;
		String y = e2.email;
		//System.out.println(e1.email);
		emailCheck(x,y);
	}

}