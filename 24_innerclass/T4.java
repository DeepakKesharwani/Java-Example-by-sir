class T5{
	//Case 1,4 :
	//int y = 90;

	//Case 2:
	//static int y = 90;

	//Case 3, 4:
	static private int y = 45;
	
	//Case 4:
	
	void process(){
		A1 d = new A1();
		d.go();
	}

	static class A1{
		void go(){
			System.out.println("Hello...~~"+y);
		}
	}
}


class T4{	
	public static void main(String[] args) {
		//Case 1, 2 & 3:		
		//T5.A1 a = new T5.A1();
		//a.go();
		
		
		//Case 4:
		T5 x = new T5();
		x.process();
	}
}







