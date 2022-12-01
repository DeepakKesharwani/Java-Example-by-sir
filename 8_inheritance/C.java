class R{

}

interface G{

}

class A implements G{

}

class B extends A{

}

class C extends B{
	public static void main(String[] args){
		C x = new C();
		
		/*
		if(x instanceof G){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}*/

		/*
		if(x instanceof R){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}*/

		/*
		if(x instanceof Object){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}*/

		/*
		if(x instanceof A){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}*/		

		/*
		if(x instanceof B){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}*/
		
		
		if(x instanceof C){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}

	}
}