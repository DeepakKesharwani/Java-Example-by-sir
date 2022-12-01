import java.util.*;

class D{
	public static void main(String[] args){
		ArrayList x = new ArrayList();

		x.add(12);
		x.add("mohan");
		x.add(new Date());
		x.add(new A());
		x.add(true);

		//System.out.println(x.get(1).length());
		System.out.println(x.get(1));
		System.out.println(((String)x.get(1)).length());
		//System.out.println(x.get(2).getTime());
		System.out.println(((Date)x.get(2)).getTime());
		
	}
}