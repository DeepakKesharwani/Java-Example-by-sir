class X{
	X(int y){
		System.out.println(y);
	}
}

class U extends X{
	int w = 13;

	U(){
		super(w);
	}

public static void main(String[] args){
		U z = new U();
	}
}