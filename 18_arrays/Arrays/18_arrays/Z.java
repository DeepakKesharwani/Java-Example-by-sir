class Z{
	public static void main(String[] args){
		int[][] x = {{88,2},{1,4,2},{12,45,56,78}};

		for(int[] y : x){
			//System.out.println(y.length);
			for(int t : y){
				System.out.print(t+" ");
			}
			System.out.println();
		}
	}
}