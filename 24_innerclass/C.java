class C {
	private int y = 781;

	public static void main(String[] args){
		//C.D d = new C().new D();
		//or
		C x = new C();
		D d = x.new D();
		
		d.go();
		System.out.println(x.y+" ~");
	}

	class D{
		//Case 1:	
		/*
		private void go(){
			System.out.println(y);
		}*/


		//Case 2:
		
		C c = new C();
		
		void go(){
			c.y = 93;

			System.out.println(c.y);
		}
	}
}
