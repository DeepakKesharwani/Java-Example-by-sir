class X{
	{
		System.out.println("M");
	}
}

class F extends X{
	{
		System.out.println("A");
	}

	public static void main(String[] args){
		System.out.println("Start");
		F x = new F();
		System.out.println("End");
	}
}