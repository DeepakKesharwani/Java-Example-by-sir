import java.util.ArrayList;

class A1
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(12);
		list.add("mohan");
		list.add(12.32f);
		list.add(12.45);
		list.add(new A());

		System.out.println(list+" ~ ");
	}
}