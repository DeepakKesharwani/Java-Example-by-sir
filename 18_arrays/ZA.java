

class ZA
{
	public static void main(String[] args){
		int[][] x={{12,45,56,78},{88,2},{1,4,2}};
		int[][] y=new int[x.length][];
		for(int i=0;i<x.length;i++){
			y[i]=new int[x[i].length];
			for(int j=0;j<x[i].length;j++){
				y[i][j]=x[i][x[i].length-j-1];
			}
		}
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(y[i][j]+" ");

			}
			System.out.println();
		}
	}
}