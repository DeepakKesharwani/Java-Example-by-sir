class S1 {	
	void go(){
		System.out.println("Outer go"+this);
	}	

	public static void main(String[] args) {	
		S1 s = new S1(){					  	
					  void go(){
						 System.out.println("Inner go"+this);
					  }	
				   };

		s.go();

		S1 d = new S1();

		d.go();
	}
}
