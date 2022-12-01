class X{
	static void pro(){
		System.out.println("X");
	}
}

class J extends X{
	public static void main(String[] args){
		//Case 3:
		X x = new J();
		x.pro();
		
		//Case 2:
		//J x = new J();
		//x.pro();


		//Case 1:
		//X x = new X();
		//x.pro();
	}

	static void pro(){
		System.out.println("J");
	}
}