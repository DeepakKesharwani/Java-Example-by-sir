class A{
	public static void main(String[] args){
		//non convertible
		//boolean x = 1;		
		//int y = false;
		
		//Conversion not required
		//int y = 20;
		//char ch = 'A';
		//float f = 7.8f;
		
		//Widenning conversion
		//int y = 'A';
		//float f = 23;
		//double d = 23L;

		//Narrowing conversion
		int y = 3.4f;
		float t = 34.6;		
		
		//Type conversion required 
		//int y = (int)3.4f;
		//float t = (float)34.6;
		//char d = (char)65.45;
		System.out.println(y);
		//System.out.println(x);
		//System.out.println(ch);
		//System.out.println(f);
		System.out.println(t);
		//System.out.println(d);

		//Special Case
		//byte b = 23;
		//short s = 56;
		char t = 78;
	}
}