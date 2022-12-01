//---

class G {
	public static void main(String[] args){		
		G e = new G();
		e.makeInst();
	}

	void makeInst(){
		H h = new H();
		h.go();
	}

	class H{
		void go(){
			System.out.println("Hello");	
		}
	}
}


