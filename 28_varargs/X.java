class X {
	public static void main(String[] args) {
		int[] x = {12,78,45};

		Y.go(x);

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
}

class Y{
	static void go(int... z){
		for(int i=0;i<z.length;i++){
			z[i] = 3;
		}
	}
}









