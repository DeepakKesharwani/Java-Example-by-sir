import java.io.FileReader;
import java.io.FileNotFoundException;

class Y{
	Y() throws FileNotFoundException{
		System.out.println("~~~~~ 9");
		FileReader r = new FileReader("xyz.txt");
		System.out.println("~~~~~ 2");
	}
}

class X extends Y{
	X() throws FileNotFoundException{
		System.out.println("~~~~~ 3");
	}

	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("~~~~~ 4");
		X x = new X();
		System.out.println("~~~~~ 1");
	}
}