class G{
	//Case 1:
	/*
	static void go(float x){
		System.out.println(x+" ++");
	}*/

	//Case 2:
	
	static void go(float x,int... t){
		System.out.println(x+" - "+t.length);
	}

	public static void main(String[] args){
		//Case 1 & 2
		//go(2.3f);

		//Case 2:
		//go(2.3f,2,3,4,5);
		go(2.3f,new int[]{67,12,34});
	}
}





