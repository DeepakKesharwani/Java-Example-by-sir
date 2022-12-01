
class L1{	
	void process(){
		System.out.println("Hello..");
	}

	static void process2(){
		System.out.println("Bye..");
	}

	private int r = 67;

	class T
	{
		int y = 15;
		class T1 implements S1
		{
			int z = 25;
			//int d = 100;
			class T2 extends X 
			{
				int x = 35;
				void go(){
					//System.out.println(this.x);
					//System.out.println(T1.this.z);
					//System.out.println(T.this.y);
					//System.out.println(L1.this.r);
					//L1.this.process();
					//L1.process2();
					
					//System.out.println(d);
					//String[] dd = {"a","b"};
					//main(dd);
					//Also run the L1$T$T1$T2 because T2 inherits main()
					//	System.out.println(u);
				}
			}
		}
	}
	

	public static void main(String[] args){
			L1 t0 = new L1();
			t0.r = -1;			
			
			L1.T t = t0.new T();
			t.y = 0;
			//System.out.println(t.d);

			L1.T.T1 t1 = t.new T1();
			t1.z = 1;

			L1.T.T1.T2 t2 = t1.new T2();
			t2.x = 2;

			t2.go();
	}
}



class X
{
	static int d = 8;

	public static void main(String[] args){
		System.out.println(d+" ##");
	}
}

interface S1
{
	int u = 34;
}















