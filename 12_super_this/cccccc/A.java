class A{
	 static int a = 90;

	public static void main(String[] args){
		A x = new A();
		A y = new A();

		x.a = 45;
		y.a = 56;

		x.pro();
		y.pro();
	}

	void pro(){
		System.out.println(a);
	}
}