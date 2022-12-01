import java.util.TreeSet;
import java.util.SortedSet;

class C{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add(78);
		set.add(12);
		set.add(89);
		set.add(34);
		set.add(47);
		set.add(23);

		//SortedSet ss = set.tailSet(100);
		//System.out.println(ss);

		//SortedSet ss = set.headSet(47);
		//System.out.println(ss);
		
		
		//System.out.println(set.first());
		//System.out.println(set.last());
	}
}