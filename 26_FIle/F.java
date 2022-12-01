import java.io.*;

class F{
	public static void main(String[] args){
		File file = new File("abc.txt");
		
		//Case 2:
		try{
			System.out.println(file.createNewFile());
		}catch(IOException e){
			e.printStackTrace();
		}

		//Case 1:
		
		/*if(!file.exists()){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}*/
	}
}