class S {
	//Case 1:
	//int y = 6;
	//Case 2:
	//private int y = 90;
	//Case 3:
	static private int y = 90;

	void go(){
		System.out.println("Outer go");
	}	

	public static void main(String[] args) {
		//Case 1:
		S s = new S(){
					
					 void go(){
						System.out.println("Inner go"+y);						
					 }

					 //Case 4:
					  
					 void go2(){
						System.out.println("Another method");
					 }
				  };
		
		//s.go();
		
		//Case 4:
		s.go2();
	}
}











