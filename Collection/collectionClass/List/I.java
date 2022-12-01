import java.util.ArrayList;

class I
{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(121);
		list.add(112);
		list.add(125);
		list.add(162);
		list.add(142);

		for(Integer i:list){
			System.out.println(i+"@");
		}
		
	}
}