import java.util.*;

class O1{
	public static void main(String[] args){
		ArrayList<Float> num1 = new ArrayList<Float>();
		num1.add(23f);
		num1.add(34f);
		num1.add(12f);
		abc(num1);

		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(23);
		num2.add(34);
		num2.add(12);
		abc(num2);

		ArrayList<Number> num3 = new ArrayList<Number>();
		num3.add(23);
		num3.add(34);
		num3.add(12);
		abc(num3);
	}

	static void abc(ArrayList<? extends Number> x){
		System.out.println(x);
	}

	/*
	static void abc(ArrayList<Integer> x){
		System.out.println(x);
	}

	static void abc(ArrayList<Number> x){
		System.out.println(x);
	}*/
}

