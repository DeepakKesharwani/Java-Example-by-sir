class Parents
{
	void property(){
		System.out.println("Parents Property");
	}

	void marraigeWith(){
		System.out.println("Geeta");
	}
}

class Son extends Parents
{
	void marraigeWith(){
		System.out.println("Lover Katrina Kaff");
	}
}

class J
{
	public static void main(String[] args){
		Parents p = new Son(); //Dynamic Method Dispatch
		p.marraigeWith();//Polymorphic method Invocation
		p.property();
	}
}