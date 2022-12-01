class Cx{
	int y;

	public static void main(String[] args){
		Cx a1 = new Cx();
		a1.y = 21;
		V v1 = a1.new V();
		v1.go(22);

		Cx a2 = new Cx();
		a2.y = 51;
		V v2 = a2.new V();
		v2.go(52);

		V v3 = a1.new V();
		v3.go(23);

		System.out.println(a1.y);
	}

	class V{
		void go(int x){
			System.out.println(y);
			y = x;
		}
	}
}