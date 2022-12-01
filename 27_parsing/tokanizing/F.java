import java.util.Scanner;

import java.io.Console;

class F{
	public static void main(String[] args){
		//Case 1:
		//System.out.println(Integer.parseInt(args[0]));
		
		//Case 2:
		//Scanner sc = new Scanner(System.in);
		//System.out.println(sc.nextInt());
					
		//Case 3:
		Console cn = System.console();
		
		//Case 3a
		//int val = Integer.parseInt(cn.readLine());
		//System.out.println(val+90);
		
		//Case 3b:
		char[] pass = cn.readPassword();
		System.out.println(pass);
	}

}