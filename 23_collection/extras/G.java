import java.util.*;

class G{
	public static void main(String[] args){
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();

		map.put("mohan", 23);
		map.put("sohan", 12);
		map.put("tohan", 5);
		map.put("rohan", 56);
		map.put("gohan", 2);

		Map.Entry entry = map.ceilingEntry("lakshman");
		System.out.println(entry);

		//String key = (String)map.ceilingKey("om");
		//String key = map.ceilingKey("om");
		//System.out.println(key);

		//System.out.println(map.descendingKeySet());
		
		/*
		Set<String> set = map.descendingKeySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String key = itr.next();
			System.out.println(key+" # "+map.get(key));
		}*/
	}
}