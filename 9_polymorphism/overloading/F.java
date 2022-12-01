class F{
	public static void main(String[] args){
		pro(2.34);
		pro('A');
		/*pro(3.4f);
		pro(23);
		pro(12);
		pro(2345);
		pro(25);
		pro(3333333333333l);
		pro(2222222222222d);*/
	}

	static void pro(char x){
		System.out.println("char");
	}

	static void pro(byte x){
		System.out.println("byte");
	}

	static void pro(short x){
		System.out.println("short");
	}
	
	static void pro(int x){
		System.out.println("int");
	}

	static void pro(long x){
		System.out.println("long");
	}

	static void pro(float x){
		System.out.println("float");
	}

	static void pro(double x){
		System.out.println("double");
	}
}