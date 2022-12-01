class T1 {
	public static void main(String[] args){
		T1 r = new T1();

		r.process();
	}

	void process(){
		A1 d = new A1();
		d.go();
	}

	static class A1{
		void go(){
			System.out.println("Hello");
		}
	}
}
