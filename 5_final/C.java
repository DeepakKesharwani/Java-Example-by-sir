final class D{
	int y = 89;
}

class C{
	public static void main(String[] args){
		D x = new D();
		x.y = 90;

		System.out.println(x.y+ "#############");
	}
}