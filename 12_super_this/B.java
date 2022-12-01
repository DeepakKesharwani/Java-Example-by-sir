class B{
	int a = 90;

	public static void main(String[] args){
		B x = new B();
		B y = new B();

		x.a = 45;
		y.a = 56;

		x.pro();
		y.pro();
	}

	void pro(){
		System.out.println(a);
		//System.out.println(this);
	}
}