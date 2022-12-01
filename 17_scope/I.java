class I{
	static void process(int x){
		x = x + 1;
	}

	public static void main(String[] args){
		int y = 2;
		
		process(y);

		System.out.println(y);
	}
}