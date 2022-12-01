class N{
	public static void main(String[] args){
		A x = new A();

		System.out.println(x.hashCode()+" ~~~~ "+x.toString());

		System.out.println(Integer.toHexString(x.hashCode())+" ~~~~ "+x.toString());
	}
}