class E{
	void abc1(){
		System.out.println("E.abc1()");
	}

	final void abc2(){
		System.out.println("E.abc2()");
	}

}

class D extends E{
	void abc1(){ //OK
		System.out.println("D.abc1()");
	}
	
	void abc2(){  //NOT OK
		System.out.println("D.abc2()");
	}
}