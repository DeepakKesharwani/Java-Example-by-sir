class A {	
	public static void main(String... args) {
		float f = 2.9f;

		//Case 1:
		//go(12,34,56,67,100,200,1,(int)f,34,'A');

		

		//Case 2:  //var args works like an array & can recieve an array obj.
		//int[] r = {12,34,56,67};
		//go(r);

		//Case 3:
		//go();

		//Case 4:
		go(2);
	}	
	 
	static void go(int... a){	
		System.out.println(a);		
		System.out.println(a.length);		
		
		/*
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" --***");
		}*/

		
		for(int s : a){
			System.out.println(s+" ***");
		}
	}

}
