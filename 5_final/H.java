//Case 2:
class H{
	public static void main(String[] args){
		final int y;

		y = 45; //OK

		y = 78;  //NOT OK
		System.out.println(y);
	}
}




//Case 1:
/*
class H{
	public static void main(String[] args){
		int y;

		//y = 90; //Comment-Uncomment
		System.out.println(y);
	}
}
*/