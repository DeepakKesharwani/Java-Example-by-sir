class V{
	public static void main(String[] args){
		int[][] x = new int[2][3];
		
		System.out.print(x[0][0]+" ");
		System.out.print(x[0][1]+" ");
		System.out.print(x[0][2]+" ");
		
		System.out.println();

		System.out.print(x[1][0]+" ");
		System.out.print(x[1][1]+" ");
		System.out.print(x[1][2]+" ");
		

		x[0][0] = 78;
		x[0][1] = 12;
		x[0][2] = 56;

		x[1][0] = 42;
		x[1][1] = 99;
		x[1][2] = 64;

		System.out.println("\n");

		System.out.print(x[0][0]+" ");
		System.out.print(x[0][1]+" ");
		System.out.print(x[0][2]+" ");
		
		System.out.println();

		System.out.print(x[1][0]+" ");
		System.out.print(x[1][1]+" ");
		System.out.print(x[1][2]+" ");
	}
}