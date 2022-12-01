class Cx{
	int y;

	public static void main(String[] args){
		Cx a1 = new Cx();
		a1.y = 21;
		V v1 = a1.new V();
		v1.go();

		Cx a2 = new Cx();
		a2.y = 51;
		V v2 = a2.new V();
		v2.go();
	}

	class V{
		void go(){
			System.out.println(y);
		}
	}
}