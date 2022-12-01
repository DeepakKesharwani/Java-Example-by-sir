import java.util.*;

class F{
	public static void main(String[] args){
		TreeMap map = new TreeMap();

		map.put("mohan", 23);
		map.put("sohan", 12);
		map.put("tohan", 5);
		map.put("rohan", 56);
		map.put("gohan", 2);
		
		//System.out.println(map.entrySet());
		Set set = map.entrySet();

		Iterator<Map.Entry> itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry entry = itr.next();

			System.out.println(entry.getKey()+" ~ "+entry.getValue());
		}
	}
}