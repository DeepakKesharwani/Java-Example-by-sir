class Outer {
	enum CoffeeSize{
		BIG,HUGE,OVERWHELMING
	};//semicolon is optional
	
	CoffeeSize cf;	
}

class F{
	public static void main(String[] args) {
		Outer x = new Outer();
		//x.cf = CoffeeSize.HUGE;//NOT OK
		x.cf = Outer.CoffeeSize.BIG;
		System.out.println(x.cf);
	}
}
