class U
{
	public static void main(String[] args){
		//byte b=12;
		//System.out.println(b);
		Byte b=new Byte(12);    //not ok
		Byte b=new Byte((byte)12);
		System.out.println(b);
}}