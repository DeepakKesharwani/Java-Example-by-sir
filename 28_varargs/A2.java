class A2{
	public static void main(String[] args){
		process(12,34);
	}

	static void process(int... a){
		for(int x : a){
			System.out.println(x);	
		}

		a[0] = 78;
		a[1] = 2;
		System.out.println("============");


		for(int x : a){
			System.out.println(x);	
		}		
	}
}