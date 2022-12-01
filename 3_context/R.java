class Y{
	int y = 90;
}

class R extends Y{
	int y = 88;

	R(){
	
	}

	public static void main(String[] args){
		R x = new R();
		x.pro();
	}

	void pro(){
		int y = 23;
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
	}
}