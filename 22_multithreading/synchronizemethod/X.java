import java.io.Console;

class X{
	public static void main(String[] args){
		Console con = System.console();
		String str = con.readLine();
		int y = Integer.parseInt(str);
		System.out.println(y+2);
	}
}