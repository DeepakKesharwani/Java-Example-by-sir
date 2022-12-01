class X{
	void pro(){
		System.out.println("X");
	}
}

class M extends X{
	public static void main(String[] args){
		//Case 3:
		X x = new M();
		x.pro();
		
		//Case 2:
		//M x = new M();
		//x.pro();

		//Case 1:
		//X x = new X();
		//x.pro();
	}
}