import java.util.ArrayList;

class A{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		System.out.println(list.size());
		System.out.println(list.isEmpty());

		Integer i = new Integer(12);
		list.add(i);

		//list.add(12);
		list.add(null);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	}
}