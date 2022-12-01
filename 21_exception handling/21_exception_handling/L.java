class L{
	public static void main(String[] args){
		System.out.println("~~~~~~ 1");
		
		System.out.println(args[0]);
		
		try{				
			int x = Integer.parseInt(args[0]);
			
			System.out.println("~~~~~~ 2");
			int[] arr = {12,0,3};
			System.out.println(arr[x]);

			System.out.println("~~~~~~ 3");
			int w = 12/arr[x];

			System.out.println("~~~~~~ 4");
			
			String s = null;
			if(x!=0){
				s = "mohan";				
			}
			System.out.println(s.length());

			System.out.println("~~~~~~ 5");
		}catch(ArithmeticException e){
			System.out.println("AE");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("AIOBE");	
		}catch(NumberFormatException e){
			System.out.println("NFE");
		}finally{
			System.out.println("##################");
		}

		System.out.println("~~~~~ 6");
	}
}