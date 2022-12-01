class X{
	public static void main(String[] args){
		int[][] x = new int[3][2];

		x[0][0] = 11;
		x[0][1] = 12;

		x[1][0] = 21;
		x[1][1] = 22;

		x[2][0] = 31;
		x[2][1] = 32;
		
		for(int i=0;i<x.length;i++){
			//System.out.println(x[i].length);
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+" ");
			}

			System.out.println();
		}
	}
}