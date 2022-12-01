class A{
	A(){
		super();
		//-------
		System.out.println("Inside Constructor");	
	}

	{
		System.out.println("Inside Init. Block");
	}

	public static void main(String[] args){
		System.out.println("Inside Main - Start");
		A x = new A();
		System.out.println("Inside Main - End");
	}
}