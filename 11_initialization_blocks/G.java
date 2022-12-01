class X{
	{ System.out.println("M");	}

	X(){  this(false);  	System.out.println("Y");	}

	X(boolean e){	System.out.println("D");	}
}

class G extends X{
	G(){ this(12); 	System.out.println("E");	}

	G(int y){ System.out.println("W"); }

	{	System.out.println("A");	}

	public static void main(String[] args){
		System.out.println("Start");
		G x = new G();
		System.out.println("End");
	}
}