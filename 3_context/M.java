//Case 1;
/*class X{
	X(int w){
		System.out.println("1)~~~~~~~~~~~"+w);
	}
}

class M extends X{
	static int y = 23;
	
	M(){
		super(y);
		System.out.println(y);	
	}

	public static void main(String[] args){
		M x = new M();
	}
}
*/
//Case 2:
class X{
	X(int w){
		System.out.println("1)~~~~~~~~~~~"+w);
	}
}

class M extends X{
	 int y = 23;
	
	M(){
		super(y);
		System.out.println(y);	
	}

	public static void main(String[] args){
		M x = new M();
	}
}