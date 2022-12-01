class E {
	public static void main(String[] args) {
		go();
	}	
	
	//Case 1:
	/*
	static void go(E... x){
		System.out.println("inside E vararg method");
	}
	static void go(int... x){
		System.out.println("inside int vararg method");
	}*/	
	
	//Case 2:
	//In case of overloaded methods when one of them is char vararg and other is byte or short vararg then the ambiguty situation arises.
	//In either cases any combination of primitive vararg combinations no ambiguty situation creates.
	/*
	static void go(double... x){
		System.out.println("inside char vararg method");
	}	
	static void go(long... x){
		System.out.println("inside int vararg method");
	}*/

	//Case 3:
	/*
	static void go(boolean... x){
		System.out.println("inside boolean vararg method");
	}	
	static void go(double... x){
		System.out.println("inside int vararg method");
	}*/
	
	//Case 4:
	
	static void go(int... x){
		System.out.println("inside int vararg method");
	}
	static void go(double... x){
		System.out.println("inside char vararg method");
	}
}







