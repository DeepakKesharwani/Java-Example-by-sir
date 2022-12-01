class T2{
	static void process(){
		A1 d = new A1();
		d.go();
	}

	static class A1{
		void go(){
			System.out.println("Hello...@@");
		}
	}
}

class T3{	
	public static void main(String[] args){
		//T2.A1 a = new T2().new A1();
		//If A1 would have been an inner class then it would have been 
		//instantiated this way.
		
		T2.A1 a = new T2.A1();

		a.go();
	}
}








