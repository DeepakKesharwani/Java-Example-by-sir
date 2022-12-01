class V{
	int u;
	
	V(){
		System.out.println(u+"###");
		u = 89;
	}
}

class W extends V{
	float j;

	W(){
		System.out.println(u+"~~~~");
		System.out.println(j+"~~~~");
	}
}

class T extends W{
	boolean m;

	T(){
		System.out.println(u+"^^^^");
		System.out.println(j+"^^^^");
		System.out.println(m+"^^^");
	}

	public static void main(String[] args){
		T x = new T();

		System.out.println(x.u+"****");
		System.out.println(x.j+"****");
		System.out.println(x.m+"****");
	}
}