enum CoffeeSize{
	//must be the first statement and must be terminated 
	BIG(8),HUGE(10),OVERWHELMING(12);
	
	private int ounces;

	CoffeeSize(int ounces){
		this.ounces = ounces;
	}	

	public int getOunces(){
		return ounces;
	}
}

class H {
	public static void main(String[] args){
		//Case 1:
		//CoffeeSize cf = CoffeeSize.BIG;
		//System.out.println(cf+" - "+cf.getOunces());

		//Case 2:
		CoffeeSize[] cfs = CoffeeSize.values();
		for(CoffeeSize cf : cfs){
			System.out.println(cf+" - "+cf.getOunces());
		}
	}
}
