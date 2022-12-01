import java.io.FileReader;
import java.io.FileNotFoundException;

class U{
	public static void main(String[] args){
		System.out.println("~~~~~ 1");
		try{
			abc();
		}catch(FileNotFoundException w){
			System.out.println("in catch");
		}
		System.out.println("~~~~~ 2");
	}

	static void abc() throws FileNotFoundException{
		System.out.println("~~~~~ 3");

		mno();
		
		System.out.println("~~~~~ 4");
	}

	static void mno() throws FileNotFoundException{
		System.out.println("~~~~~ 5");
		FileReader x = new FileReader("xyz.txt");
		System.out.println("~~~~~ 6");
	}
}