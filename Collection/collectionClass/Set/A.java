import java.util.HashSet;

class A{
	public static void main(String[] args){
		HashSet set = new HashSet();
		
		//Case 2:
		
		set.add("raghav");
		set.add("mukesh");
		set.add("vipin");
		set.add("santosh");
		set.add("rahul");

		System.out.println(set);
		//System.out.println(set.contains("santosh"));
		//System.out.println(set.contains("vinod"));

		System.out.println(set.remove("vapin"));
		System.out.println(set);
		

		//Case 1:
		/*
		set.add(12);
		set.add(90);
		set.add(22);
		set.add(56);
		set.add(41);
		
		System.out.println(set);
		//System.out.println(set.contains(22));
		//System.out.println(set.contains(34));

		System.out.println(set.remove(90));
		System.out.println(set);
		*/


		
	}
}