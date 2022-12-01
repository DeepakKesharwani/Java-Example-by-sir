import java.util.LinkedList;

class K{
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		
		/* As a Queue */
		/*list.offer(34);
		list.offer(2);
		list.offer(97);
		list.offer(45);
		list.offer(22);

		for(int i=0;i<5;i++){
			System.out.println(list.peek());
		}*/

		/* As a List */
		
		list.add(12);
		list.add(45);
		list.add(2);
		list.add(9);
		list.add(17);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.remove(i));
		}
		

		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}