class A{

}

class C extends A{

}

class Z{

}

class R extends A{
	public static void main(String[] args){
		Object o = new R();
		//Z o = new Z();

		if(o instanceof C){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}