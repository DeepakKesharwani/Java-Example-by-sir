import java.util.ArrayList;

class F{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(12);
		list.add(45);
		list.add(67);
		list.add(2);
		list.add(23);
		
		System.out.println(list);
		
		System.out.println(list.remove(2));
				
		System.out.println(list);
		System.out.println(list.get(2));
	}
}






