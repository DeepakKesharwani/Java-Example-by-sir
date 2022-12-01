class ZB{
	public static void main(String[] args){
		int[][] x = {{12,45,56,78},{88,2},{1,4,2}};
		
		for(int i=x.length-1;i>=0;i--){
			//System.out.println(x[i].length);
			for(int j=x[i].length-1;j>=0;j--){
				System.out.print(x[i][j]+" ");
			}

			System.out.println();
		}
	}
}