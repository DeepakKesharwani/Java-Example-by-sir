package a1.a2;

//Case 2:
import b1.b2.*;

//Case 1:
//import b1.b2.C;
//import b1.b2.B;

class A{
	public static void main(String[] args){
		//Case 1 & 2
		
		B x = new B();
		x.pro();

		C c = new C();
		System.out.println(c.z);
	}
}