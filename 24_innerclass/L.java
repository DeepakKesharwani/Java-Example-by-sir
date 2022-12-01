//---

class M {
	private int y = 64;

	class N{
		int y = 90;
		void go(){
			//System.out.println(this);
			//System.out.println(this.y);

			//System.out.println(M.this);
			//System.out.println(M.this.y);
			
			N n = N.this;
			System.out.println("Inner - "+n.y);				
		}
	}
}

class L{
	public static void main(String[] args){		
		M i = new M();
		M.N j = i.new N();
		j.go();
	}
}










