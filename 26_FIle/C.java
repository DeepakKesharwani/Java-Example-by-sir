import java.io.File;

class C{
	public static void main(String[] args){
		File f = new File("../xyz/mno.txt");
		//File f = new File("D:/www.txt");

		System.out.println(f.exists());
	}
}