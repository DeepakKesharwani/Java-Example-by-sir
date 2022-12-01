class R {
	int y = 78;
	static int u = 56;

	static void go(){
		class R1{
			void process(){
				System.out.println(u);
				//System.out.println(y);
				//System.out.println(this);
				//System.out.println(R.this);
			}
		}

		R1 e = new R1();
		e.process();
	}


	void go2(){
		class R1{
			void process(){
				//System.out.println(u);
				//System.out.println(y);
				//System.out.println(this);
				System.out.println(R.this+" ###");
			}
		}

		R1 e = new R1();
		e.process();		
	}
	
	public static void main(String[] args) {
		//Case 2:		
		go();
		
		//Case 1:
		//R r = new R();
		//System.out.println(r+"~~~~~");
		//r.go2();
	}
}
