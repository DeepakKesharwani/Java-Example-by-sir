import java.util.regex.*;

class PQR{
	public static void main(String[] args){
		Pattern p = Pattern.compile("abc");
		
		Matcher m = p.matcher("tyabc _ yrtabc io");

		//System.out.println(p);
		//System.out.println(m);
		
		while(m.find()){
			System.out.println(m.group()+"~"+m.start()+"~"+m.end());
		}

		System.out.println("~~~~~~~~~~~~~~~~~~");
	}
}