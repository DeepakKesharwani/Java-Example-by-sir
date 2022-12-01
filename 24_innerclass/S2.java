class S2 
{	
	Xx e = new Xx(){
				public void go(){
					System.out.println(S2.this+"In an anonymus inner class"+this);
				}
			};

	public static void main(String[] args) {
		S2 x = new S2();

		System.out.println(x);

		x.e.go();		
	}
}

interface Xx{
	void go();
}
