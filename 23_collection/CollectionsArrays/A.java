import java.util.*;

class A{
	public static void main(String[] args){
		List list = new ArrayList();

		list.add("ratnesh");
		list.add("jitendra");
		list.add("vikram");
		list.add("sanket");
		list.add("deepak");

		//Case 1:
		/*
		list.add(34);
		list.add(78);
		list.add(2);
		list.add(12);
		list.add(56);*/

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}








