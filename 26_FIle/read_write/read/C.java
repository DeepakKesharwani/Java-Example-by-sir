import java.io.*;

class C{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("abc.txt");
		
		char[] x = new char[3];
		
		int cn = 0;
		while((cn=fr.read(x))!=-1){
			for(int i=0;i<cn;i++){
				System.out.print(x[i]);
			}

			//System.out.println("\n");
		}

		fr.close();
	}
}