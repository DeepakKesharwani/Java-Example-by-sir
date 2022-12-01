import java.util.ArrayList;

class G
{
	public static void main(String[] args){
	
	ArrayList list = new ArrayList();
	
	list.add(12);
	list.add(122);
	list.add(124);
	list.add(121);
	list.add(127);
	list.add(120);
	list.add(102);

	System.out.println(list);
	System.out.println(list.get(4));
	System.out.println(list.get(14));// exception arrayindexoutofbounds exception
	System.out.println(list);
	}

}