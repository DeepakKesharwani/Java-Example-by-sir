import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

class A{
	public static void main(String[] args){
		HashMap map = new HashMap();

		map.put(12,"mohan");
		map.put(45,"sohan");
		map.put(5,"rohan");
		map.put(32,"gohan");
		map.put(57,"tohan");

		System.out.println(map);
		System.out.println(map.remove(45));
		System.out.println(map);

		//System.out.println(map.get(15));

		//System.out.println(map.containsKey(17));
		//System.out.println(map.containsValue("gohan"));
		//System.out.println(map.size());
		//System.out.println(map.isEmpty());
		
		//Case 2:
		/*
		Set x = map.keySet();
		Iterator<Integer> itr = x.iterator();
		while(itr.hasNext()){
			Integer o = itr.next();
			System.out.println(o+" ~~ "+map.get(o));
		}*/

		//Case 1:
		
		Set x = map.keySet();
		Iterator itr = x.iterator();
		while(itr.hasNext()){
			Object o = itr.next();
			System.out.println(o+" ~~ "+map.get(o));
		}
	}
}






















