class S02 
{
	//Case 1:
	//Y e = new E();

	Y e = new Y(){
			public void go(){
				System.out.println(this+".....");
			}
		 };	

	Y e2 = new Y(){
				public void go(){
					System.out.println(this+"++++++");
				}
			};	

	public static void main(String[] args) 
	{
		S02 x = new S02();

		System.out.println(x.e.z);
		x.e.go();
		x.e2.go();
	}
}

interface Y
{
	int z = 90;

	void go();
}

//Case 1:
/*
class E extends Y
{
	void go(){
		System.out.println("Bye..");
	}
}*/
