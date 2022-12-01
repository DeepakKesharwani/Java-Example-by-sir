class X{
	int y = 90;
}

class K extends X{
	int y = 56;
	
	public static void main(String[] args){
		//Case 3:
		X q = new K();
		System.out.println(q.y);
		
		//Case 2:
		//K w = new K();
		//System.out.println(w.y);

		//Case 1:
		//X e = new X();
		//System.out.println(e.y);
	}
}