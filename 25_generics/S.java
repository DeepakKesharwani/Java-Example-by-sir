import java.util.*;

class S{
	public static void main(String[] args){
		ArrayList<Integer> x = new ArrayList<Integer>();

		x.add(12);
		x.add(13);
		x.add(14);

		iterate(x);

		System.out.println("\n##############");

		ArrayList<Float> y = new ArrayList<Float>();

		y.add(2.34f);
		y.add(8.12f);
		y.add(7.23f);

		iterate(y);
	}

	
	static void iterate(ArrayList<? extends Number> arr){
		for(Number i : arr){
			System.out.print(i+" ");
		}
	}

	/*
	static void iterate(ArrayList<Float> arr){
		for(Float i : arr){
			System.out.println(i);
		}
	}

	static void iterate(ArrayList<Integer> arr){
		for(Integer i : arr){
			System.out.println(i);
		}
	}*/
}