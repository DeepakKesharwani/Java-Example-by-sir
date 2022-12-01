import java.util.ArrayList;
import java.util.Iterator;

class H
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
			
		list.add(23);
		list.add(31);
		list.add(3);
		list.add(243);
		list.add(231);
		list.add(13);
		list.add(203);
		
		//case 1
		/*
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		
		}
		*/
		//case 2
		
		/*
		Iterator i = list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		*/

		//case 3

		for(Object i:list){
			System.out.println(i+"@");
		}
	
	}
}