class D{
	public static void main(String[] args){
		//Case 1:
		//String s = Boolean.toString(12>23);
		//String s = Boolean.toString(12<23);
		//Case 2:
		//Boolean b = new Boolean(12>23);
		Boolean b = new Boolean(12<23);
		//System.out.println(b);
		String s = b.toString();

		System.out.println(s);
	}
}