class X
{
	double r=14.0;
	static double pi=3.14;
	void calArea(){
		System.out.println(pi*r*r);
	}
	public static void main(String[] args){
		X x = new X();
		x.calArea();
	
	}
}