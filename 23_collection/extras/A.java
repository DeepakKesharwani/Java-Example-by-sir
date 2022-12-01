import java.util.ArrayList;

class A{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(23);
		list.add(89);
		list.add(12);
		list.add(6);

		System.out.println(list);

		Object[] arr = list.toArray();

		System.out.println("~~~~~~~~~~~~~~~~~~~");

		for(Object tmp : arr){
			System.out.println(tmp);
		}
	}
}



