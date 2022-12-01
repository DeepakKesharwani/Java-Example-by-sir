// Cyclic Inheritence
class X extends F
{
	static{
		System.out.print("print a");
	}
}

class F extends X
{
	static{
		System.out.print("print b");
	}
}