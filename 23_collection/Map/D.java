import java.util.Hashtable;

class D{
	public static void main(String[] args){
		Hashtable map = new Hashtable();

		map.put("mohan", 12);
		map.put("sohan", 34);
		map.put("rohan", 56);
		map.put("gohan", 9);
		map.put("tohan", 14);

		System.out.println(map);

		//map.put(null, 12);
		map.put("karthik", null);
	}
}