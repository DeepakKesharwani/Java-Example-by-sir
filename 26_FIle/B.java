import java.io.File;

class B{
	public static void main(String[] args){
		File f = new File("abc.txt");
		//File f = new File("mno/abc.txt");
		//File f = new File("mno/abc");

		System.out.println(f.exists());
	}
}