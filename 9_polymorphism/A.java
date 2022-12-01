class A {
	void go1(){
		System.out.println("In A");
	}
}

class B extends A{
	void go2(){
		System.out.println("In B");
	}

	public static void main(String[] args){
		/*Object x = new B();
			//x.go2();
			//x.go1();
		System.out.println(x.toString());*/
	
		
		/*A x = new B();
		//x.go2();
		x.go1();
		System.out.println(x.toString());
		*/


		
		B x = new B();
		x.go2();
		x.go1();
		System.out.println(x.toString());
		
	}
}