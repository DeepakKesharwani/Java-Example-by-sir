class Q{
	public static void main(String[] args){
		System.out.println("~~~~~~ 1");	
		
		try{				
			int x = Integer.parseInt(args[0]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(">"+e.getMessage()+"<");
			//System.out.println(e);
			//e.printStackTrace();
		}catch(NumberFormatException e){
			//System.out.println(e.getMessage());
			System.out.println(e);
			//e.printStackTrace();
		}

		System.out.println("~~~~~ 5");
	}
}