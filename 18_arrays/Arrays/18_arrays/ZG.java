class ZG{
	public static void main(String[] args){
		int[][] x = {{12,45,56,78},{88,2},{1,4,2}};
		int[][] y = new int[x.length][]; 

		for(int i=0;i<x.length;i++){
			int z = x.length-i-1;
			y[i] = new int[x[z].length];
			for(int j=0;j<x[z].length;j++){
				y[i][j] = x[z][x[z].length-j-1];
			}
		}

		for(int i=0;i<y.length;i++){
			for(int j=0;j<y[i].length;j++){
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
	}
}