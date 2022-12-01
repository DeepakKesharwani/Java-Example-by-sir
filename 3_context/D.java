class D{
	static int y = 80;

	public static void main(String[] args){
		D x = new D();
		x.process();
	}

	void process(){
		System.out.println(y);
	}
}