import java.io.File;

class M{
	public static void main(String[] args){
		//File file = new File("abc/mno/pqr/xyz");
		
		//File file = new File("abc/mno/pqr","xyz");
		//File file = new File("abc","mno/pqr/xyz");
		//File file = new File("abc/mno","pqr/xyz");

		//File file = new File("C://Drives/D/javaprac/file","abc/mno/pqr/xyz");
		
		File f = new File("C://Drives/D");
		File file = new File(f,"javaprac/file/abc/mno/pqr/xyz.txt");

		System.out.println(file+" ^^^");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
	}
}