import java.util.LinkedHashMap;

class E{
	public static void main(String[] args){
		//Case 1:
		//LinkedHashMap map = new LinkedHashMap();
		
		//Case 2:
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("mohan", 12);
		map.put("sohan", 34);
		map.put("rohan", 56);
		map.put("gohan", 9);
		map.put("tohan", 14);

		System.out.println(map);
	}
}