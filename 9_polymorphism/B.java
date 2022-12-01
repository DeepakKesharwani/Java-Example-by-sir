class X
{
}
class A{

}

class B extends A{
	public static void main(String[] args){
		//Object o = new B();
		X o = new B();

		
		if(o instanceof A){
			System.out.println("yes~");
		}else{
			System.out.println("no");	
		}
		
		
		if(o instanceof B){
			System.out.println("yes");
		}else{
			System.out.println("no");	
		}
		
	}
}