class B{
	B(){
		super();
		//-------
		System.out.println("1 - Inside Constructor");	
	}

	{
		System.out.println("7 - Inside Init. Block");
	}

	public static void main(String[] args){
		System.out.println("2 - Inside Main - Start");
		B x1 = new B();
		B x2 = new B();
		System.out.println("5 - Inside Main - End");
	}
}