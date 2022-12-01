//Single Inheritance

class X{
	void pro(){
		System.out.println("Hello");
	}
}

class B extends X{
	public static void main(String[] args){
		B x = new B();
		x.pro();

		System.out.println(x.toString());
	}
}