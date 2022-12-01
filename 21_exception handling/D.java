class D{
	public static void main(String[] args){
		abc();
	}

	static void pro(){
		int a = 12/0;
	}

	static void abc(){
		pro();
	}
}