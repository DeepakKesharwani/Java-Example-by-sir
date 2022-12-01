import java.io.File;

class L{
	public static void main(String[] args){
		File file = new File("a");

		String[] list = file.list();

		for(String str : list){
			System.out.println(str);
		}
	}
}