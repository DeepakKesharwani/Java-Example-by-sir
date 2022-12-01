class Circle
{
	int r;
	final static float PI = 3.14f;
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.r = 5;
		Circle c2 = new Circle();
		c2.r = 7;
		
		c1.calArea();
		c2.calArea();		
	}
	
	void calArea(){
		System.out.println(PI*r*r);
	}
}
