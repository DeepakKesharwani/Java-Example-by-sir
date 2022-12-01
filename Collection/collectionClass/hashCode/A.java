class A{
	public static void main(String[] args){
		A x = new A();

		System.out.println(x.toString());
		System.out.println(x.hashCode());
		System.out.println(Integer.toHexString(x.hashCode()));
	}
}