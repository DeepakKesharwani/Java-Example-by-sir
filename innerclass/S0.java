//Case 1:

class S0
{
	Y e = new E(); 
	public static void main(String[] args){
		S0 x = new S0();
		x.e.go();
		System.out.println(x.e.z);
	}
}
class Y
{
	int z = 90;
	void go3(){
	
	}

	void go(){
		System.out.println("Hello...");
	}

	void go2(){
		System.out.println("Bye ....");
	}
}

class E extends Y
{
	void go(){
		System.out.println("Bye..");
	}
}