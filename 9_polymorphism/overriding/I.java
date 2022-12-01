class X{
	void pro(){
		System.out.println("X");
	}
}

class I extends X{
	public static void main(String[] args){
		//Case 3:
		X x = new I();
		x.pro();
		
		//Case 2:
		//I x = new I();
		//x.pro();


		//Case 1:
		//X x = new X();
		//x.pro();
	}

	void pro(){
		System.out.println("I");
	}
}