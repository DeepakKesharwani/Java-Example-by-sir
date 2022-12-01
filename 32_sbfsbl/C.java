class C{
	public static void main(String[] args){
		StringBuffer sbuff = new StringBuffer("mohan");

		System.out.println(sbuff.charAt(2));
		System.out.println(sbuff.indexOf("a"));
		System.out.println(sbuff.indexOf("oh"));
		System.out.println(sbuff.lastIndexOf("oh"));
		System.out.println(sbuff.insert(2,true));
		//System.out.println(sbuff==sbuff.insert(13,true));

		//String str1 = "mohan";
		//String str2 = "mohan";
		//System.out.println(str1==str2);
	}
}