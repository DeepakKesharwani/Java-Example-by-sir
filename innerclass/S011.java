class S011
{
	//int z =20;
	//Case 1:
	//Y e = new E();

	Y e = new Y(){
				 void go(){
					System.out.println(this+".........");
				 } 
			};
	Y e2 = new Y(){
				void go(){
					System.out.println(this+"+++++++++");
				}
				
			};
		
	public static void main(String[] args){
		S011 x = new S011();
		
		System.out.println(x.e.z);

		x.e.go();
		x.e2.go();
	}
}

abstract class Y
{
	int z =90;

	void go(){
		System.out.println("Hello");
	}
}
/*
class E extends Y
{
	void go(){
		System.out.println("Bye..");
	}

}
*/