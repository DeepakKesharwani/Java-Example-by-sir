
import java.io.FileNotFoundException;

class Y{
	public static void main(String[] args){
		System.out.println("~~~~ 1");

		//Case 2:
		
		try{
			System.out.println("~~~~ 2");
			
			//Please uncomment the code and try again
			//FileNotFoundException x = new FileNotFoundException();
			//throw x;
		}catch(FileNotFoundException e){
			System.out.println("~~~~ 3");
		}

		//Case 1:
		/*
		try{
			System.out.println("~~~~ 2");
		}catch(ArithmeticException e){
			System.out.println("~~~~ 3");
		}*/

		System.out.println("~~~~ 4");
	}
	}
/*	

import java.io.FileNotFoundException;
class Y1
{
public static void main(String[] args){
	System.out.println("~~~~~~~~~1");
	//case1
	try{
		System.out.println("~~~~~~~~2");
		
		//Please uncomment the code and try again
		FileNotFoundException x = FileNotFoundException();
		throw x;
	}catch(FileNotFoundException e){
		System.out.println("~~~~~~~~~~~3");
	
	}

	System.out.println("~~~~~~~~~~~~~~~~4");
}


}
*/