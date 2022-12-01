enum CoffeeSize{
	BIG,HUGE,OVERWHELMING
};//semicolon is optional

class D {
	CoffeeSize cf;

	public static void main(String[] args) {
		D x = new D();
		x.cf = CoffeeSize.HUGE;
		System.out.println(x.cf);
	}
};
