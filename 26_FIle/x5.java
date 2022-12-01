import java.io.File;
class x5
{
	public static void main(String[] args){
		File file = new File("mna");
		File[] f = file.listFiles();
		System.out.println(f);
	}
}
