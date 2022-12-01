class ZC{
	public static void main(String[] args){
		//Case 3:
		
		try{
			throw new ArithmeticException();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("AE");	
		}finally{
			throw new NullPointerException();	
		}
		
		//Case 2:
		/*
		try{
			throw new ArithmeticException();
		}catch(ArithmeticException e){
			System.out.println("AE");	
		}finally{
			throw new NullPointerException();	
		}*/

		//Case 1:
		/*
		try{
			throw new ArithmeticException();
		}catch(ArithmeticException e){
			throw new NullPointerException();	
		}*/
	}
}