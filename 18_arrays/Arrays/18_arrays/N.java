//Case 2:
/*
class N{
	public static void main(String[] args){
		int[] x = {56,67,34,12};
		int[] y = new int[x.length];

		for(int i=0;i<x.length;i++){
			y[i] = x[x.length-i-1];
		}

		for(int i=0;i<y.length;i++){
			System.out.println(y[i]);
		}
	}
}*/

//Case 1:

class N{
	public static void main(String[] args){
		int[] x = {56,67,34,12};
		int[] y = new int[x.length];

		for(int i=0;i<x.length;i++){
			y[i] = x[i];
		}

		for(int i=0;i<y.length;i++){
			System.out.println(y[i]);
		}
	}
}