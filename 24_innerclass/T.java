class T {
	//Case 2:
	//int y = 8;

	//Case 3:
	//static int y = 9;      

	//Case 4:
	//private static int y = 20;

	//Case 1a:
	
	void go(){
		A1 x = new A1();
		x.go();
	}

	public static void main(String[] args) {
		//Case 1, 3 & 4:
		//A1 x = new A1();
		//x.go();

		//Case 1a:
		T t = new T();
		t.go();
	}

	static class A1{
		void go(){
			//Case 1 & 1a:
			System.out.println("inside the nested class ++"+this);
			
			//Case 2, 3 & 4:
			//System.out.println(y+" ~~~~");			
		}
	}
}





