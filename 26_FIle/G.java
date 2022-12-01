import java.io.File;

class G{
	public static void main(String[] args){
		File file = new File("mno");
		
		System.out.println(file.mkdir());
	}
}