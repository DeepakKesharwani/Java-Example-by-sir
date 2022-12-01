import java.util.ArrayList;

class D
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		//Case 1
		//Integer i = 12;         //boxing than conversion(Autoboxing)
		//list.add(i);
		
		//Case 2
		list.add(23);
		list.add(3);

		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	
	
	}
}