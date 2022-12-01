//Method Local Inner Class
class O {
	private int x = 120;

	public static void main(String[] args) {
		O o = new O();
		o.go();
	}

	void tp(){
	}

	void go(){
		//Case 2: ---x //Forward Referencing 
		//P p = new P();
		//p.process();
		
		class P{
			void process(){
				System.out.println(x);
			}
		}
		
		//Case 1:
		//P p = new P();
		//p.process();
	}

	//Case 3:
	
	void go2(){
		P p = new P();
		p.process();
	}
}













