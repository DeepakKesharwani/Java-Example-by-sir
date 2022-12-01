class S0 {
	//Case 1:
	Y e = new E();
	
	//Case 2:
	/*
	Y e = new Y(){
				void go(){
					z = 100;
					System.out.println("Bye ......!......");
					System.out.println("Bye ..%%..~~~~~*~~~~~."+this);
					System.out.println("Bye ..%%..~~~~~*~~~~~."+e);
				}
		  };
	*/	
	
	//Case 3:
	/*
	Y e2 = new Y(){
					void go2(){
						System.out.println("Bye ..%%.........."+this);
					}

					void go3(){
						System.out.println("Bye ..%####%..^^^........");
					}
				};
	*/

	public static void main(String[] args) {
		S0 x = new S0();
		
		//Case 1 & 2:
		x.e.go();
		//System.out.println(x.e.z);
		
		//Case 3:
		//x.e2.go2();
		//x.e2.go();
		//x.e2.go3();
	}
}

class Y{
	int z = 90;

	void go3(){
	
	}

	void go(){
		System.out.println("Hello..");
	}

	void go2(){
		System.out.println("Bye ............");
	}
}

//Case 1:

class E extends Y{
	void go(){
		System.out.println("Bye..");
	}
}










