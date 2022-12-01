class Circle{
	int r;
	static float pi = 3.14f;

	void calArea(){
		System.out.println(pi*r*r);
	}

	static float getPI(){
		return pi;
	}
}