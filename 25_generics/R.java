import java.util.*;

class R{
	public static void main(String[] args){
		ArrayList<A> a1 = new ArrayList<A>();
		ArrayList<B> a2 = new ArrayList<B>();
		ArrayList<C> a3 = new ArrayList<C>();
		ArrayList<D> a4 = new ArrayList<D>();

		pro(a1);
		pro(a2);
		pro(a3);
		pro(a4);
	}

	static void pro(ArrayList<? extends A> x){
		System.out.println("####");		
	}
}

class A{ }
class B extends A{ }
class C extends B{ }
class D extends C{ }









