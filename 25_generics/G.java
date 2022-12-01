import java.util.*;

class G{
	public static void main(String[] args){		
		
		ArrayList<String> x = new ArrayList<String>();

		x.add("12");
		x.add("mohan");
		x.add("new Date()");
		x.add("new A()");
		x.add("true");
		
		String str = x.get(3);
		System.out.println(str);
	}
}