import java.io.File;

class N{
	public static void main(String[] args){
		File f = new File("M.class");

		System.out.println(f.delete());
	}
}