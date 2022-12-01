class D{
	D(){
		System.out.println("D()");
	}

	{
		System.out.println("Xyz");
	}

	static{
		System.out.println("Abc");
	}

	public static void main(String[] args){
		System.out.println("Hello");
		D x1 = new D();
		D x2 = new D();
		System.out.println("Bye");
	}
}