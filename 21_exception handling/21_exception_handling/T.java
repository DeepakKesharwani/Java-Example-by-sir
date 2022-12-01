class T{
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

	static void mno(){
		System.out.println("~~~~~ 5");
		String s = null;
		System.out.println(s.length());
		System.out.println("~~~~~ 6");
	}
}