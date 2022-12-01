class V{
	public static void main(String[] args){
		System.out.println("~~~~~ 1");
		abc();
		System.out.println("~~~~~ 2");
	}

	static void abc(){
		System.out.println("~~~~~ 3");

		mno();
		
		System.out.println("~~~~~ 4");
	}

	static void mno() /*throws ArithmeticException*/{
		System.out.println("~~~~~ 5");
		int a = 12/0;
		System.out.println("~~~~~ 6");
	}
}