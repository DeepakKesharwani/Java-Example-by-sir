import java.io.File;

class I{
	public static void main(String[] args){
		File f1 = new File("abc.txt");

		File f2 = new File("mno.txt");

		f1.renameTo(f2);
	}
}