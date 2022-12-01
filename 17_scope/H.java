class X{
	int y = 22;
}

class H extends X{
	int y = 67;

	public static void main(String[] args){
		H x = new H();
		x.process();
	}

	void process(){		
		int y = 90;

		System.out.println(y);
		System.out.println(this.y);	
		System.out.println(super.y);	
	}
}