class X{
	static int y = 22;
}

class G extends X{
	static int y = 67;

	public static void main(String[] args){
		//int y = 45;
		
		{
			int y = 75;

			System.out.println(y);
		}
	}
}