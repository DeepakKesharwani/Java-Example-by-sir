import java.util.Scanner;

class C {
	public static void main(String[] args) {
		boolean b2, b;
		int i;
		String s, hits = "";
				
		//Case 1:
		/*
		Scanner s1 = new Scanner("abc\nyui\tuyi u");
		while(s1.hasNext()) {
			   s = s1.next();
			   System.out.println(s);
			   hits += s;
		}*/

		//Case 2:
		/*
		Scanner s2 = new Scanner(args[0]);
		while(s2.hasNext()) {
			//System.out.println(">"+s2.next()+"<");
			if (s2.hasNextInt()) {
				System.out.println(">"+s2.nextInt()+"<"); 
				hits += "i";
			} else if (s2.hasNextBoolean()) {
				System.out.println(">"+s2.nextBoolean()+"<"); 
				hits += "b";
			} else {
				System.out.println(">"+s2.next()+"<");
				hits += "s2";
			}
		}*/

		
		//Case 3: //     34 ab 56
		
		Scanner sc = new Scanner(args[0]);
		Scanner s1 = sc.useDelimiter("[^\\d]");
		//System.out.println(s1==sc);
		
		while(s1.hasNext()){
			System.out.println(">"+s1.next()+"<");
		}

		

		System.out.println("hits " + hits);
	}
}