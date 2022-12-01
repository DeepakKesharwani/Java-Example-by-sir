import java.util.ArrayList;

class D{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(12);
		list.add(45);
		list.add(67);
		list.add(2);
		list.add(23);
		
		System.out.println(list);
		list.add(2,33);
		//list.set(2,33);
		System.out.println(list);
	}
}






