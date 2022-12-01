import java.util.regex.*;

class H1{
	public static void main(String [] args) {
		Pattern p = Pattern.compile("[^abc]"); // the expression

		Matcher m = p.matcher("adbcfaarabtc"); // the source

		System.out.print("abcaaabcdfrt\n==============\n");
		while(m.find()) {
			System.out.println(m.start() + " "+m.group());
		}
	}
}