import java.io.File;

class J{
	public static void main(String[] args){
		File f1 = new File("mno.txt");

		File f2 = new File("pqr/mno.txt");

		f1.renameTo(f2);
	}
}