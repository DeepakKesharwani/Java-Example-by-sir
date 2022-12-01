class F{
	final void pro(){
		System.out.println("F.pro()");
	}
}

class E extends F{
	public static void main(String[] args){
		E x = new E();

		x.pro();
	}
}