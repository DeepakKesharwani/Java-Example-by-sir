class A1{
	public static void main(String[] args){
		process();
	}

	static void process(int... a){
		System.out.println(a.length);

		a = new int[2];

		System.out.println(a.length);
	}
}