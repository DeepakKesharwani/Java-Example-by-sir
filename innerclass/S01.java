
//Case 2:

class S01
{
	Y e = new Y(){
				void go(){
					z = 100;
					System.out.println("Bye ...!......");
					System.out.println("Bye .. %%..~~~~~~~*~~~~~~."+this);
					System.out.println("Bye ..%%..~~~~~~*~~~~~~."+e);

				}
			};
	public static void main(String[] args){
		S01 x = new S01();
		x.e.go();
		System.out.println(x.e.z);
	
	}
}
class Y
{
	int z = 90;

	void go3(){
	
	}
	
	void go(){
		System.out.println("Hello");
	}

	void go2(){
		System.out.println("Bye......");
	}
}