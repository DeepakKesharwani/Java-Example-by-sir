class P{
	public static void main(String[] args){
		System.out.println("~~~~~~ 1");

		try{
			System.out.println("~~~~~~ 2");
			int a = 12/0;
		}finally{
			System.out.println("~~~~~~ 3");
		}

		System.out.println("~~~~~~ 4");
	}
}