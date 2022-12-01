class B 
{
	//Case 1:
	/*
	static void go(String... a,float... q){
		
	}*/

	//Case 2:
	
	static void go(String... a,float q){
		
	}


	//Case 3:
	/*
	static void go(float q,int g,String... a){
		
	}*/

	//Case 4:
	/*
	static void go(float[] q,String... a){

	}*/

	//Case 5:
	/*
	static void go(String[] q,String... a){

	}*/

	//Case 6:
	/*
	static void go(String[] q,String[] a){

	}*/

	//Case 7: Violation of overloading rule
	/*
	static void go(String[] q,String... a){

	}	
	static void go(String[] q,String[] a){

	}*/
	
	//Case 8:
	/*
	static void go(String q,String... a){

	}*/

	//Case 9:
	/*
	static void go(String q,String...... a){

	}*/
	
	//Case 10:
	/*
	static void go(String q,String[][]... a){

	}*/
}
