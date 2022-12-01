class J{
	public static void main(String[] args){
		System.out.println("~~~~~~ 1");	
		
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
		}catch(Exception e){
			System.out.println("E");
		}

		System.out.println("~~~~~ 6");
	}
}