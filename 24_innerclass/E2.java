class E2{
	private int x = 9;
	
	void go(int y){
		System.out.println(y+" ----");
	}

	public static void main(String[] args){
		//Case 1:
		/*
		E2 e = new E2();
		F2 f = e.new F2();
		f.go2();
		//f.go(23);
		*/

		//Case 2:
		/*
		E2 e = new E2();
		F2 f = e.new F2();
		f.go(45);*/
	}

	class F2{
		//Case 1:
		/*
		void go2(){
			go(x);
		}*/

		//Case 2:
		/*
		void go(int z){
			System.out.println(z+" ++++");
		}*/
	}
}