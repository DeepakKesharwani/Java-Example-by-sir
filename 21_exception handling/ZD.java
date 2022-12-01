class ZD{
	static{
		String s = null;
		System.out.println(s.length());
	}

	public static void main(String[] args){
		System.out.println("~~~~1");
		ZD x = new ZD();
		System.out.println("~~~~2");
	}
}


//Case 1:
/*
class ZD{
	{
		String s = null;
		System.out.println(s.length());
	}

	public static void main(String[] args){
		System.out.println("~~~~1");
		ZD x = new ZD();
		System.out.println("~~~~2");
	}
}*/