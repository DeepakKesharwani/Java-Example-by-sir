class A{
	public static void main(String[] args){
		boolean b = Boolean.parseBoolean(args[0]);
		//boolean b = Boolean.parseBoolean(args[1]);
		if(b){
			System.out.println("Hello");
		}else{
			System.out.println("Bye");	
		}
	}
}