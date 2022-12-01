import java.util.regex.*;

class H2{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("[a-z&&[def]]"); // the expression

		Matcher m = p.matcher("abdcaeaabfct"); // the source

		while(m.find()) {
			System.out.println(m.start() + " "+m.group());
		}
	}
}