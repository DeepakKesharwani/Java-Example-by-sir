import java.util.ArrayList;

class B{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(23);
		list.add(89);
		list.add(12);
		list.add(6);

		System.out.println(list);

		Integer[] x = new Integer[0];
		Integer[] arr = list.toArray(x);

		System.out.println("~~~~~~~~~~~~~~~~~~~");

		for(Integer tmp : arr){
			System.out.println(tmp);
		}
	}
}



