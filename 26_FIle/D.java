import java.io.File;

class D{
	public static void main(String[] args){
		File f = new File("aa");
		//File f = new File("abc.txt");

		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}
}