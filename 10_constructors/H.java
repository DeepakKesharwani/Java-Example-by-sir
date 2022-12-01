class X{
	X(){
		System.out.println("X()");
	}
}

class H extends X{
	H(){
		System.out.println("H()");
	}

	public static void main(String[] args){
		System.out.println("main() --> start");
		
		H x = new H();

		System.out.println("main() --> exit");
	}
}