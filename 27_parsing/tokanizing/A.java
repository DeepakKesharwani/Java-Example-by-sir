class A {
	public static void main(String[] args) {
		
		//Case 1:
		//String str = "ab,cd5b,6x,z4";			
		//String[] atrArr = str.split(",");
		
		//Case 2:
		//String str = "ab,cd5b,68x,z4";		
		//String[] atrArr = str.split("\\d");

		//Case 3:
		//String str = "ab, cd5 b,68 x,z4";		
		//String[] atrArr = str.split(" ");

		//Case 4:		
		String str = "a   b";			
		String[] atrArr = str.split(" ");
		
		
		for(String x : atrArr){
			System.out.println(">"+x+"<");
		}
	}
}