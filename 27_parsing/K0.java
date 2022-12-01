import java.util.regex.*;

class K0{
	public static void main(String[] args){
		Pattern p = Pattern.compile("w.r");
		Matcher m = p.matcher("whrkrw.rjhhkwjrjk");

		while(m.find()){
			System.out.println(m.start()+" ----- "+m.group());
		}
	}
}