class B1{
	void process(int[] s){
		System.out.println("---");
	}
}

class C1 extends B1{
	//Case 1:
	/*
	void process(byte... s){
		System.out.println("++");
		//return 12;
	}*/

	//Case 2:		
	/*
	void process(int... s){
		System.out.println("++");
		//return 12;
	}*/
}