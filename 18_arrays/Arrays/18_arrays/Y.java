class Y{
	public static void main(String[] args){
		int[][] x = {{1,4,2},{12,45,56,78},{88,2}};

		for(int i=0;i<x.length;i++){
			//System.out.println(x[i].length);
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+" ");
			}

			System.out.println();
		}
	}
}