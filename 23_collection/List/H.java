import java.util.ArrayList;
import java.util.Iterator;

class H{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(45);
		list.add(67);
		list.add(2);
		list.add(23);
		
		//System.out.println(list);
			
		//Case 3:
		for(Integer i : list){
			System.out.println(i+" @");
		}
	}
}






