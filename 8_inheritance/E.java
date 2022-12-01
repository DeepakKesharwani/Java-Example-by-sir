// Multilevel Inheritence
class A1
{
	void pro(){
		System.out.println("print A");
	}
}

class B1 extends A1
{
	void pro1(){
		System.out.println("Print B");
	}
}

class E extends B1
{
	public static void main(String[] args){
		E e = new E();
		e.pro();
		e.pro1();
	}
}