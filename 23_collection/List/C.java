import java.util.ArrayList;

class C{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(12);
		list.add(45);
		list.add(67);
		list.add(2);
		list.add(23);
		list.add(79);
		list.add(2);

		System.out.println(list);
		
		//Case 1:
		//System.out.println(list.remove(2));
		
		//Case 2:
		//System.out.println(list.remove(10));
		
		//Case 3:
		Integer i = new Integer(2);
		System.out.println(list.remove(i));
		
		
		System.out.println(list);
	}
}






