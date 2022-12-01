class A{
	public static void main(String[] args){
		A x = new A();
		System.out.println(x);

		A y = new A();
		System.out.println(y);

		x.pro();
		y.pro();
	}

	void pro(){
		//System.out.println(x);
		System.out.println(this+" ~~~~");
	}
}