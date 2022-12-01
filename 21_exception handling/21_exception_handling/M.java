class M{
	public static void main(String[] args){
		System.out.println("~~~~~~ 1");	
		
		try{				
			int x = Integer.parseInt(args[0]);
			System.out.println("~~~~~~ 5");
		}catch(NumberFormatException e){
			System.out.println("E1");
		}catch(NumberFormatException e){
			System.out.println("E2");
		}

		System.out.println("~~~~~ 6");
	}
}