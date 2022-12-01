class Y{
	Y y = new Y();

	Y(){
		System.out.println("~~~~1");
	}

	public static void main(String[] args){
		System.out.println("~~~~3");
		Y x = new Y();	
		System.out.println("~~~~2");
	}
}