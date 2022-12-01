//inner classes cannot have static declarations
//but still you can create final-static-variables(constant)

class A1 {
	class B {
		final static int a = 90;

		static void go(){
		
		}
	}
}
