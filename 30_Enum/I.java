enum CoffeeSize{
	//must be the first statement and must be terminated 
	BIG(8),HUGE(10),OVERWHELMING(16);
	
	private int ounces;

	CoffeeSize(int ounces){
		this.ounces = ounces;
	}	

	public int getOunces(){		
		return ounces;
	}
}

class I 
{
	public static void main(String[] args) {
		//CoffeeSize cf = new CoffeeSize(2);
	}
}
