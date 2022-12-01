class C {
	public static void main(String[] args) {
		//Case 1:
		//go(23,(int)23.8,(int)29L);

		//Case 2:
		byte b = 90;
		go(2,b,23.5f,6L,78f);

		//Case 3:
		//go(new int[]{2,3,(int)23.9});
	}

	//Case 1:
	/*
	static void go(int... a){
	
	}*/	
	
	//Case 2 & 3:
	
	static void go(double... d){
		System.out.println(d[d.length-1]);
	}
}








