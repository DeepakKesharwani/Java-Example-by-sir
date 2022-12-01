class E5 {
	class E6{
		private int r = 45;
		//int r = 45;
	}

	class E7 extends E6{
		
	}

	//Case 1:	
	/*
	public static void main(String[] args) {
		E5 x = new E5();
		E7 y = x.new E7();
		//E6 y = x.new E6();

		System.out.println(y.r);// NOT OK
	}*/
}

//Case 2:

class T{
	public static void main(String[] args){
		E5 x = new E5();
		E5.E6 t = x.new E6();

		System.out.println(t.r);
	}
}