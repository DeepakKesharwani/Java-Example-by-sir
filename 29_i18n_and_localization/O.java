import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.io.*;

class O {
	public static void main(String[] args) {	
		Locale locJA = new Locale("ja"); // Japan

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locJA);
		
		Date dt = new Date();
		String dtx = df.format(dt);
		System.out.println(dtx);
			
		
		File f = new File("dt.doc");
		
		try{
			f.createNewFile();

			PrintWriter pw = new PrintWriter(f);
			
			pw.print(dtx);
			pw.print('\u00fc');

			pw.flush();
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}
}
