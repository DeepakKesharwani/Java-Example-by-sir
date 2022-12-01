class W{
	public static void main(String[] args){
		System.out.println("~~~~~~~~~~~~~~~~~1");
		if(args.length==0){
			CommandEmptyException x = new CommandEmptyException();
			System.out.println("~~~~~~~~~~~~~~~~~2");
			
			//Case 1:
			//throw x;

			//Case 2:
			
			try{
				throw x;
			}catch(CommandEmptyException e){
				e.printStackTrace();
			}			
		}
		System.out.println("~~~~~~~~~~~~~~~~~3");
	}
}

class CommandEmptyException extends Exception{
	CommandEmptyException(){
	
	}

	CommandEmptyException(String message){
		super(message);
	}
}