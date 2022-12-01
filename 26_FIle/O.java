import java.io.*;

class O{
	public static void main(String[] args) throws IOException{
		File f1 = new File("a/b/c");

		f1.mkdirs();

		File f2 = new File(f1,"abc.txt");

		f2.createNewFile();
	}
}