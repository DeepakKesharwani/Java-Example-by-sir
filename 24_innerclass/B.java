class B {
	class B1{
		void process(){
			System.out.println("~~~~");
		}
	}

	void go(){
		B1 x = new B1();
		x.process();
	}

	public static void main(String[] args){
		B r = new B();
		
		B1 t = r.new B1();

		r.go();
		
		
		System.out.println(B.class+" ~ "+B1.class);
		System.out.println(r.getClass()+" ~ "+t.getClass());
		
		try{
			System.out.println(Class.forName("B")+" ~ "+Class.forName("B$B1"));
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}








