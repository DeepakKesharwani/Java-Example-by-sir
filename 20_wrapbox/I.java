class I{
	public static void main(String[] args){
		Number n = new Integer(12);

		//Number n = 23;//boxing then conversion
		//Object n = 'A';//boxing then conversion
		
		System.out.println(n);
		System.out.println(n+1);

		//if(n instanceof Character){
		//	System.out.println("Integer object");
		//}
	}
}