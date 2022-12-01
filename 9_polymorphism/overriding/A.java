class X{
	void abc(){
		System.out.println("Inside X");
	} 
}

class A extends X{
	void abc(){
		System.out.println("Inside A");
	}

	public static void main(String[] args){
		A a = new A();
		a.abc();
	}
}