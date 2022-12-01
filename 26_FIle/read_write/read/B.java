import java.io.*;

class B{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("abc.txt");
		
		char[] x = new char[3];
		
		int cn = 0;
		while((cn=fr.read(x))!=-1){
			for(char ch : x){
				System.out.print(ch);
			}

			//System.out.println("\n");
		}

		fr.close();
	}
}