class D 
{
	//Case 1:
	//int... a;
		
	//Case 2:
	
	D(int... w){
		for(int y=0;y<w.length;y++){
			System.out.println(w[y]+" **");
		}
	}

	//Case 2a:
	
	public static void main(String[] args) 
	{
		new D(12,45,78,56,3);
	}
}
