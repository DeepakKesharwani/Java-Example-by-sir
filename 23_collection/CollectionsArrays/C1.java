import java.util.*;

class C1{
	public static void main(String[] args){
		List list = new ArrayList();

		list.add("ratnesh");
		list.add("jitendra");
		list.add("vikram");
		list.add("sanket");
		list.add("deepak");

		System.out.println(list);
		Collections.sort(list);
		//System.out.println(Collections.binarySearch(list,"sanket"));
		System.out.println(Collections.binarySearch(list,"mukesh"));

	}
}