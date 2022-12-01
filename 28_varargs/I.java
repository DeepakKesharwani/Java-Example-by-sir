class I{
	public static void main(String[] args){
		go(2,8);
	}

	static void go(float... x){
		System.out.println(x.length);

		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}