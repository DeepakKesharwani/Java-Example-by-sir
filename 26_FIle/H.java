import java.io.File;

class H{
	public static void main(String[] args){
		//File file = new File("abc/mno/pqr");
		File file = new File("abc/mno/pqr/kkk.txt");
		
		System.out.println(file.mkdirs());
	}
}