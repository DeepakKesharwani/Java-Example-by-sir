public class Solution{
	static String SwapName(String x,String y){
		String temp = x;
		x = y;
		y=temp;
		System.out.println(x);
		System.out.println(y);
		return null;
	}
	public static void main(String[] args){
		Employee e1 = new Employee(1,"aaa");
		Employee e2 = new Employee(2,"bbb");
		//System.out.println(e1.name);
		//System.out.println(e2.name);
		String x = e1.name;
		String y = e2.name;
		//System.out.println(x);
		//System.out.println(y);
		SwapName(x,y);

	}
}