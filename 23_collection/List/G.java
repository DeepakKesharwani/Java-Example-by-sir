import java.util.ArrayList;
import java.util.Iterator;

class G{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(12);
		list.add(45);
		list.add(67);
		list.add(2);
		list.add(23);
		
		//System.out.println(list);
			
		//Case 3:
		for(Object i : list){
			System.out.println(i+" @");
		}


		//Case 2:
		/*
		Iterator i = list.iterator();
		while(i.hasNext()){
			System.out.println(i.next()+" #");
		}*/		
		
		//Case 1:
		/*
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i)+" ~");
		}
		*/
	}
}






