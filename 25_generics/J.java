import java.util.*;


class J{
	public static void main(String[] args){
		ArrayList x = new ArrayList();

		x.add(12);
		x.add("56");
		x.add(true);

		pro(x);
	}

	static void pro(ArrayList<Integer> x){
		x.add(23);

		System.out.println(x);
	}
}



