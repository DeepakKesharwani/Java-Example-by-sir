class X{
	X(int y){
		this();
		System.out.println("~~~~~ E");
	}
	X(){
		System.out.println("~~~~~ Z");
	}
}
class P extends X{
	P(){
		super(12);
		System.out.println("~~~~~ A");
	}
	P(float y){
		this();
		System.out.println("~~~~~ S");
	}
	public static void main(String[] args){
		P x = new P(12.67f);	
	}
}
