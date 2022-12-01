import java.io.Console;

class G{
	public static void main(String[] args){
		Console con = System.console();
/*
		char[] passw = con.readPassword();
		System.out.println("###############");
		for(char c : passw){
			System.out.print(c);
		}
*/		System.out.print("Enter a number a:");
		int a = Integer.parseInt(con.readLine());
		System.out.print("Enter a number b:");
		int b = Integer.parseInt(con.readLine());
		int c1=a+b;
		System.out.println("sum a+b ="+c1);
		System.out.print("Enter a number a:");
		float c = Float.parseFloat(con.readLine());
		System.out.print("Enter a number b:");
		float d = Float.parseFloat(con.readLine());
		
		float f1=c-d;

		//Case 1:
		//String str = con.readLine();
		//System.out.println("###############");
		//System.out.println(str);
		//System.out.println(b);
		System.out.println("Difference c-d ="+f1);
	}
}