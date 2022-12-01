import java.util.ArrayList;

class E
{
	public static void main(String[] args){
	
	ArrayList list = new ArrayList();

	list.add(22);
	list.add(32);
	list.add(67);
	list.add(3);
	
	System.out.println(list);
	//System.out.println(list.remove(2));

	Integer i = new Integer(3);
	list.remove(i);
	System.out.println(list);


	
	}
}