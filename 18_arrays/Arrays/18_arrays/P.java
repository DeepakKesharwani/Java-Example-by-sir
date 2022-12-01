class P{
	public static void main(String[] args){		
		byte b = 34;
		short s = 345;
		char e = 'D';
		long k = 23L;
		float w = 2.34f;

		//Case 1:
		//int y = (int)k;
		//System.out.println(y);
		
		//Case 2:
		
		int[] x = {12,b,s,e,'A',(int)k,(int)w};
		
		for(int tmp : x){
			System.out.println(tmp);
		}		
	}
}