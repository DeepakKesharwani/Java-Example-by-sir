class A{
	boolean b;
	char c;
	byte bt;
	short s;
	int i;
	long l;
	float f;
	double d;

	String str;
	A a;

	public static void main(String[] args){
		A x = new A();
	
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(x.bt);
		System.out.println(x.s);
		System.out.println(x.i);
		System.out.println(x.l);
		System.out.println(x.f);
		System.out.println(x.d);

		System.out.println(x.str);
		System.out.println(x.a);
		//System.out.println((int)'a');
	}
}