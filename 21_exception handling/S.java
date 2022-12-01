import java.io.*;

class S{
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("~~~~~ 1");

		//Case 3:
		FileReader x = new FileReader("abc.txt");	

		//Case 2:
		/*
		try{
			FileReader x = new FileReader("abc.txt");	
		}catch(FileNotFoundException e){
			System.out.println("In Catch");
		}*/

		//Case 1:
		//FileReader x = new FileReader("abc.txt");	


		System.out.println("~~~~~ 2");
	}
}