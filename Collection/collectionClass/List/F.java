import java.util.ArrayList;

class F
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(23);
		list.add(13);
		list.add(203);
		list.add(223);
		list.add(423);
		list.add(253);
		list.add(823);
		
		System.out.println(list);

		//case 1
		//list.add(2,33);

		//case 2
		list.set(2,37);
		System.out.println(list);
	}
}