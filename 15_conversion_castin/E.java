class E{
	public static void main(String[] args){
		byte x = 127;
		byte y = 1;
		
		//byte b = x + y;
		//byte b = (byte)x + y;
		byte b = (byte)(x + y);
		System.out.println(b);
	}
}