enum CoffeeSize{
	//must be the first statement and must be terminated 
	BIG(8),HUGE(10),OVERWHELMING(16){
										public String getLid(){
											return "A";
										}
								    };
	
	private int ounces;
	private String lid = "B";

	CoffeeSize(int ounces){
		this.ounces = ounces;
	}	

	public int getOunces(){
		return ounces;
	}

	public String getLid(){
		return lid;
	}
}

class K 
{
	public static void main(String[] args) 
	{
		for(CoffeeSize cf : CoffeeSize.values()){
			System.out.println(cf+" - "+cf.getOunces()+" - "+cf.getLid());		
		}
	}
}
