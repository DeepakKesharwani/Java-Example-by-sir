//---

class I {
	private int u = 64;

	class J{
		private int u = 90;

		void go(){
			System.out.println("Hello - "+u);	
		}
	}
}

class K{
	public static void main(String[] args){		
		I i = new I();
		I.J j = i.new J();
		//j.go();
		j.u = 78;//-----x
	}
}










