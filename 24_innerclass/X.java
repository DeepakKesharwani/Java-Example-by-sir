class X{
	int y = 89;

	static int z = 67;
	
	//Case 1:
	/*
	void go1(){
		
		class A1{
			void process(){
				System.out.println(y);
				System.out.println(z);
			}
		}

		A1 e = new A1();
		e.process();
	}*/
	
	//Case 2:
	
	static void go2(){
		class A2{
			void process(){
				//System.out.println(y);
				System.out.println(z);
			}
		}

		A2 e = new A2();
		e.process();
	}
	
	public static void main(String[] args){
		//Case 2:
		go2();
		
		//Case 1:
		//X x = new X();
		//x.go1();
	}
}









