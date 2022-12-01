class H{
	static void go(String x,String... t){
		System.out.println(x+" - "+t.length);
				
		for(String s : t){
			System.out.println(s+" **");
		}
	}	

	public static void main(String[] args){
		//Case 1:
		//go("mo","so","ro","go");
		
		//Case 2:
		//go("mo");
		
		//Case 3:
		//go();
		
		//Case 4:
		String[] d = {"so","ro","go"};
		go("mo",d);
	}
}

















