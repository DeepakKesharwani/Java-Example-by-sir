class DX
{
	void abc(){
		System.out.println("Inheritence abc");
	}
}

class D extends DX
{
	public static void main(String[] args){
		D f = new D();
		f.abc();
		f.abc1();
	}

	void abc1(){
		System.out.println("Inheritence abc1");
	}
}