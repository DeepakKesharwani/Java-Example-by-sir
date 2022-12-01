class E{
	E(){ System.out.println("E()");	}

	{	System.out.println("Xyz");	}

	static{  System.out.println("Abc");	}

	{ System.out.println("Mno"); }

	static{  System.out.println("Kkr");	}

	public static void main(String[] args){
		System.out.println("Hello");
		E x1 = new E();
		//E x2 = new E();
		System.out.println("Bye");
	}
}