import java.util.*;


class I{
	public static void main(String[] args){
		ArrayList<Integer> x = new ArrayList<Integer>();

		x.add(12);
		x.add(56);
		x.add(700);
		//x.add("soghan");

		pro(x);
		//Integer i = x.get(3);
		System.out.println(x.get(3));
	}

	static void pro(ArrayList x){
		x.add("mohan");

		System.out.println(x);
	}
}






