class X{
	static int y = 90;
}

class L extends X{
	static int y = 56;
	
	public static void main(String[] args){
		//Case 3:
		X q = new L();
		System.out.println(q.y);
		
		//Case 2:
		//L w = new L();
		//System.out.println(w.y);

		//Case 1:
		//X e = new X();
		//System.out.println(e.y);
	}
}