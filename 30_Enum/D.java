enum CoffeeSize{
	BIG,HUGE,OVERWELHMING
};

class D
{
	CoffeeSize cf;
	public static void main(String[] args){
		D x = new D();
		//x.cf = CoffeeSize.BIG;
		//x.cf = CoffeeSize.HUGE;
		x.cf = CoffeeSize.OVERWELHMING;
		System.out.println(x.cf);

	
	}
}