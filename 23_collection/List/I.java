import java.util.ArrayList;

class I{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		
		list.add("mohan");
		list.add("sohan");
		list.add("tohan");
		list.add("rohan");
		list.add("gohan");
		list.add("rohan");

		boolean flag = list.contains("mohan");
		System.out.println(flag);
		

		//Case 1:
		/*
		list.add(12);
		list.add(78);
		list.add(34);
		list.add(89);
		list.add(2);
		list.add(20);
		
		boolean flag = list.contains(23);
		System.out.println(flag);
		*/
	}
}