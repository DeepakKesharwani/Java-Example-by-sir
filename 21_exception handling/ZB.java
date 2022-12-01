class ZB{
	public static void main(String[] args){
		System.out.println(pro());
	}

	static int pro(){
		try{
			return 25;
		}catch(NullPointerException e){
			e.printStackTrace();
		}finally{
			System.out.println("In Finally");
		}

		return 12;
	}
}