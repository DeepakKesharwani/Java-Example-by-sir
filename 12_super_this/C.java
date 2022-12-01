class X{
	int y = 89;
}

class C extends X{
	int y = 78;

	public static void main(String[] args){
		C c = new C();
		c.pro();
	}

	void pro(){
		int y = 23;

		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
	}
}