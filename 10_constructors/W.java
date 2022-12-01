class X{
	private X(){
		System.out.println("1");
	}

	static X createObject(){
		X x = new X();

		return x;
	}
}

class W{
	public static void main(String[] args){
		//X x = new X();
		X x = X.createObject();

		System.out.println("2");
	}
}