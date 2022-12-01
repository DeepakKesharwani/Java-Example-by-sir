class B{
	public static void main(String[] args){
		//byte b = Byte.parseByte(args[0]);


		//byte b = Byte.parseByte("128");
		//byte b = Byte.parseByte("12");
		//byte b = Byte.parseByte("1a");
		//byte b = Byte.parseByte("\u00fa");

		//byte b = Byte.parseByte("1101",2);
		//byte b = Byte.parseByte("45",8);
		//byte b = Byte.parseByte("45",10);
		//byte b = Byte.parseByte("45",16);

		//byte b = Byte.parseByte("42",5);
		byte b = Byte.parseByte("1a",16);

		System.out.println(b+2);
	}
}