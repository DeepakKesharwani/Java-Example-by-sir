class Z{

	<T> Z(T x){
		System.out.println(x);
	}

	public static void main(String[] args){
		String s = "mohan";
		Z z = new Z(s);
	}
}