class S02
{
	Y y = new Y(){
	
				void go2(){
					System.out.println("Bye ..%%......\n"+this);
				}
				void go3(){
					System.out.println("Bye ...%#########%..^^^......");
				}
	
			};
	public static void main(String[] args){
	
		S02 x = new S02();

		x.y.go();
		x.y.go2();
		x.y.go3();
	
	}
}

class Y
{
	int z = 90;

	void go(){
	
	}

	void go2(){
		System.out.println("Hello .......");
	}

	void go3(){
		System.out.println("Bye.......+++");
	}
}