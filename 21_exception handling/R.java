class R{
	public static void main(String[] args){
		System.out.println("~~~~ Start");
		try{
			//ArithmeticException x = new ArithmeticException("Hello");

			R x = new R(); //NOT OK

			//AssertionError x = new AssertionError();

			//String x = new String("mohan"); //NOT OK

			//Throwable x = new Throwable();

			throw x;
		}catch(Object e){
		//}catch(Throwable e){
			System.out.println("~~~~ In Catch");
			System.out.println(e.getMessage());
		}
		System.out.println("~~~~ End");
	}
}

