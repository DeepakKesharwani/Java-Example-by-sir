class A{
	public static void main(String[] args){
		//String str = "mohan is a mohan boy and mohan plays mohan";
		//String[] tokens = str.split(" ");
		
		String str = "asdh3kzx7nz";
		String[] tokens = str.split("\\d");

		System.out.println(tokens.length);

		for(String tmp : tokens){
			System.out.println(tmp);
		}
	}
}