class Z{
	public static void main(String[] args){
		System.out.println("~~~~~5");
		try{
			System.out.println("~~~~~6");
			pro();
			System.out.println("~~~~~7");
		}catch(ArithmeticException e){
			System.out.println("Catch in main");
		}
		System.out.println("~~~~~8");
	}

	static void pro(){
		System.out.println("~~~~~1");
		try{
			System.out.println("~~~~~2");
			int a = 12/0;
			System.out.println("~~~~~3");
		}catch(ArithmeticException e){
			System.out.println("Catch in pro");
			//throw e;
			NullPointerException n = new NullPointerException();
			throw n;
		}
		System.out.println("~~~~~4");
	}
}

/*class Z{
	public static void main(String[] args){
		System.out.println("~~~~~5");
		try{
			System.out.println("~~~~~6");
			pro();
			System.out.println("~~~~~7");
		}catch(ArithmeticException e){
			System.out.println("Catch in main");
		}
		System.out.println("~~~~~8");
	}

	static void pro(){
		System.out.println("~~~~~1");
		try{
			System.out.println("~~~~~2");
			int a = 12/0;
			System.out.println("~~~~~3");
		}catch(ArithmeticException e){
			System.out.println("Catch in pro");
			throw e;
		
		}
		System.out.println("~~~~~4");
	}
}*/