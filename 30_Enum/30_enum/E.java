class E {
	/*static*/ enum CoffeeSize{
		BIG,HUGE,OVERWHELMING
	};//semicolon is optional
	
	CoffeeSize cf;

	public static void main(String[] args) {
		E x = new E();
		x.cf = CoffeeSize.OVERWHELMING;
		System.out.println(x.cf);
	}
}


class W{
	void pro(){
		E.CoffeeSize e = E.CoffeeSize.HUGE;	
	}
}










