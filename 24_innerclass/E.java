class E {
	private int r = 34;
	
	class F{
		int r = 99;		
		void go(){
			System.out.println("Hello "+r+"---");	
		}
	}

	public static void main(String[] args){
		//Case 1:
		//F f = new F();//----x
		
		//Case 2:
		E e = new E();
		E.F f = e.new F();
		f.go();

		//Case 3:
		//E e = new E();
		//F f = e.new F(); //-----ok
		//f.go();

		//Case 4:
		//E e = new E();
		//e.go();//----x		

		//Case 5:
		//E e = new E();
		//e.process();

		//Case 6:
		//E e = new E();
		//E f = e.new F(); //-----x
	}

	void process(){
		F f = new F();
		f.go();
	}	
}


