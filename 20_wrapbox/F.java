class F{
	public static void main(String[] args){
		byte b = 15;
		
		//String s = Byte.toString(b);

		Byte x = new Byte(b);
		String s = x.toString();

		System.out.println(s+1);//concatination
		System.out.println(b+1);//addition
	}
}