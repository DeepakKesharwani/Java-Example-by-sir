class B{
	public static void main(String[] args){
		//Case 2:
		
		StringBuffer sbuff1 = new StringBuffer("mohan");
		String str = new String("sohan");
		StringBuffer sbuff2 = sbuff1.append(str);
		System.out.println(sbuff2);
		System.out.println(sbuff1==sbuff2);
		
			
		//Case 1:
		/*
		String str1 = new String("mohan");
		String str2 = new String("sohan");
		String str3 = str1.concat(str2);
		System.out.println(str3);
		//System.out.println(str3==str1);
		//System.out.println(str3==str2);
		*/
	}
}