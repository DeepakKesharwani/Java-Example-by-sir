class X{
	static X x = new X();

	private X(){
		System.out.println("1");
	}
}

class W{
	public static void main(String[] args){
		
		X x = X.x;

		System.out.println("2");
	}
}