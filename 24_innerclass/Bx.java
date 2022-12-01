class Bx{
	int y = 90;

	class B{

	}

	static void process(){
		//Case 1:
		//B y = new B();
		
		//Case 2:
		//Bx x = new Bx();
		//B y = x.new B();
		
		//Case 3:
		//B y = new Bx().new B();		
	}
}