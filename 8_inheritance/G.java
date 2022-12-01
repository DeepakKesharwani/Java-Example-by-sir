class P
{
	void and(){
		System.out.println("print and");
	}
}

class Q extends P
{
	void or(){
		System.out.println("print or");
	}
}

class R extends P
{
	void not(){
		System.out.println("print not");
	}
}

class S extends Q
{
	void xor(){
		System.out.println("print xor");
	}
}

class T extends Q
{
	public static void main(String[] args){
		T t = new T();
		t.or();
		//t.xor();
		t.and();
		//t.not();
		
	}
}
