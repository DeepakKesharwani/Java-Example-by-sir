class N{
	public static void main(String[] args){
		System.out.println("~~~~~~ 1");	
		
		//Case 2: //OK
		try{							
			System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("E2");
		}catch(IndexOutOfBoundsException e){
			System.out.println("E1");
		}


		//Case 1: //NOT OK
		/*
		try{							
			System.out.println(args[0]);
		}catch(IndexOutOfBoundsException e){
			System.out.println("E1");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("E2");
		}*/

		System.out.println("~~~~~ 6");
	}
}