import java.util.*;
import java.io.*;

class E 
{
	public static void main(String[] args) 
	{
		try{			
			File f = new File("abc.txt"); //exists

			//Case 1:
			//Scanner sc = new Scanner(f);
			
			//Case 2:
			//FileInputStream fs = new FileInputStream(f);
			//Scanner sc = new Scanner(fs);			
			
			sc.useDelimiter(" ");
			while(sc.hasNext()){
				System.out.println(sc.next());
			}		
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
