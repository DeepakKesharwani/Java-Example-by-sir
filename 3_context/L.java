class X{
	X(int w){
		System.out.println(w);
	}
}

class L extends X{
	int y = 89;
	
	L(){
		super(y);
		System.out.println(y);	
	}

	public static void main(String[] args){
		L x = new L();
	}
}