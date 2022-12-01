class X{
	X(int y){
		System.out.println(y);
	}
}

class V extends X{
	static int w = 13;

	V(){
		super(w);
	}

public static void main(String[] args){
		V z = new V();
	}
}