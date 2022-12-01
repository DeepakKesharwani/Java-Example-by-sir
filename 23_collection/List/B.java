import java.util.ArrayList;

class B{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add(4.56);
		list.add(true);

		System.out.println(list.size());
		System.out.println(list.isEmpty());

		System.out.println(list.contains("mohan"));
	}
}