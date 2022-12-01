class K{
	public static void main(String[] args){
		Integer i = 12;
		
		Boolean r = process(i);

		System.out.println(r==true);
	}

	static boolean process(int y){
		Boolean e = true;

		if(e){
			System.out.println(y);
		}

		return e;
	}
}