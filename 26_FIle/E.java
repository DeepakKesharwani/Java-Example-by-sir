import java.io.File;

class E{
	public static void main(String[] args){
		File f = new File("abc.txt");
	
		System.out.println(f.getAbsolutePath());
		
		//Case 1:
		//String fileAbsoPath = f.getAbsolutePath();
		//File file = new File(fileAbsoPath);
		

		//Case 2:
		File file = f.getAbsoluteFile();

		//Case 1 and 2
		System.out.println("##########");
		System.out.println(f);
		System.out.println(file);
		
	}
}