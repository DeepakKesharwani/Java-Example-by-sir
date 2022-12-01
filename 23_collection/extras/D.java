import java.util.TreeSet;
import java.util.NavigableSet;

class D{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add(78);
		set.add(12);
		set.add(89);
		set.add(34);
		set.add(47);
		set.add(23);

		//System.out.println(set.ceiling(39));
		//System.out.println(set.ceiling(100));
		
		//System.out.println(set.floor(39));
		//System.out.println(set.floor(10));
		//System.out.println(set.floor(78));

		NavigableSet ns = set.tailSet(34,false);
		System.out.println(ns);
	}
}








