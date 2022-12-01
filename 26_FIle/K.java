import java.io.File;

class K{
	public static void main(String[] args){
		File f1 = new File("rajesh.txt");

		File f2 = new File("pqr/mukesh.txt");

		f1.renameTo(f2);
	}
}