import java.io.File;

class x1{
	public static void main(String[] args){
		//File f = new File("abc/mno/pqr/kkk.txt");
		//File f = new File("abc/mno/pqr","kkk.txt");
		//File f1 = new File("abc/mno/pqr");
		File f1 = new File("E:/javaprac/26_FIle");

		File f = new File(f1,"abc/mno/pqr/kkk.txt");
		System.out.println(f);
	
	}

}