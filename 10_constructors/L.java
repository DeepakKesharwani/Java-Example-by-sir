class Shape{
	int l;
	int w;
	int h;	
	
	Shape(int l){
		this.l = l;
	}

	Shape(int l,int w){
		this.l = l;
		this.w = w;
	}

	Shape(int l,int w,int h){
		this(l,w);
		//this.l = l;
		//this.w = w;
		this.h = h;
	}

	public static void main(String[] args){
		Shape s1 = new Shape(12,141,45);

		System.out.println(s1.l);
		System.out.println(s1.w);
		System.out.println(s1.h);
	}
}