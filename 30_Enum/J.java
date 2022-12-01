enum CoffeeSize{
	//must be the first statement and must be terminated 
	BIG(8,"A"),HUGE(10,"B"),OVERWHELMING(16,"C");
	
	private int ounces;
	private String lid;

	CoffeeSize(int ounces,String lid){
		this.ounces = ounces;
		this.lid = lid;
	}	

	public int getOunces(){
		return ounces;
	}

	public String getLid(){
		return lid;
	}
}

class J 
{
	public static void main(String[] args) 
	{
		//Case 1:
		//CoffeeSize cf = CoffeeSize.BIG;
		//System.out.println(cf+" - "+cf.getOunces()+" - "+cf.getLid());		

		//Case 2:
		
		for(CoffeeSize cf : CoffeeSize.values()){
			System.out.println(cf+" - "+cf.getOunces()+" - "+cf.getLid());		
		}
	}
}
