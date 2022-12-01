class E{
	public static void main(String[] args){
		System.out.println("~~~~~~ 1");
		
		try{
			int a = 12/0;
		}catch(ArithmeticException e){
			System.out.println("Problem");
		}
		

		System.out.println("~~~~~~~ 2");
	}
}