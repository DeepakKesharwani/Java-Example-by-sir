import java.util.regex.*;

class D {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
				System.out.println(args[i]+" -----");	
		}

		String tmp1 = args[0];
		String tmp2 = args[1];
		
		Pattern p = Pattern.compile(tmp1);
		Matcher m = p.matcher(tmp2);
		
		System.out.println("Pattern is " + m.pattern());
		
		while(m.find()) {
			  System.out.println(m.start() + " >" + m.group()+"<");
		}

		//Case 2:
		//m.find();
		//System.out.println(m.start() + " >" + m.group()+"<");
	}
}