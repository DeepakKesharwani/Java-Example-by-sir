import java.util.*;

class Q{
	public static void main(String[] args){
		ArrayList<Integer> x = new ArrayList<Integer>();

		x.add(12);
		x.add(67);
		x.add(89);

		pro(x);

		System.out.println(x);
	}

	static void pro(ArrayList<? extends Number> arr){
		//arr.add(12);
		//System.out.println(((Integer)arr.get(0)).toHexString(12));
		arr.remove(new Integer(12));
	}
}












