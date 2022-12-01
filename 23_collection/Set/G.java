class G{
	public static void main(String[] args){
		//Case 1:
		Integer i1 = new Integer(20);
		Integer i2 = new Integer(34);
		Integer i3 = new Integer(20);
		
		//Case 2:
		//String i1 = new String("mohan");
		//String i2 = new String("mihan");
		//String i3 = new String("mohan");
		
		
		System.out.println(i1.compareTo(i2));
		System.out.println(i2.compareTo(i1));
		System.out.println(i1.compareTo(i3));
	}
}