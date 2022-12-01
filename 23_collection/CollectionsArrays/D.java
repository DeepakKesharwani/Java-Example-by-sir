import java.util.*;

class D{
	public static void main(String[] args){
		int[] x = {23,67,12,2,90,45};

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		
		Arrays.sort(x);

		System.out.println("#################");
		//System.out.println(x);

		for(int tmp : x){
			System.out.println(tmp);
		}
	}
}