class E1 {
	public static void main(String[] args){
		//Case 1:
		//E e = new E();
		//E.F f = e.new F();
		//f.go();

		//Case 2:
		E1 e1 = new E1();
		e1.process();
	}	

	void process(){
		//Case 2a
		//F f = new F();//Not Ok
		
		//Case 2b		
		E e = new E();
		E.F f = e.new F();
		f.go();
	}
}


