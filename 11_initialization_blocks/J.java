class J{
	{
		System.out.println("X-~");
	}

	J(int y){
		//System.out.println("X-~");
		System.out.println("S-");
	}

	J(){
		//System.out.println("X-~");
		System.out.println("K-");
	}

	public static void main(String[] args){
		J x = new J();
		J y = new J(12);
	}
}