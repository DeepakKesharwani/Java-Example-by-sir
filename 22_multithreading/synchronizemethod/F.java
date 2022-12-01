class X implements Runnable{
	public void run(){
		F.f.abc();			
	}
}

class Y implements Runnable{
	public void run(){
		F.f.mno();
	}
}

class F{
	static F f = new F();

	public static void main(String[] args){
		X x = new X();
		Thread t1 = new Thread(x,"mohan");

		Y y = new Y();
		Thread t2 = new Thread(y,"sohan");

		t1.start();
		t2.start();
	}

	synchronized void abc(){		
		for(int i=0;i<20;i++){
			System.out.println(i+"-"+Thread.currentThread().getName());	
		}		
	}
	
	synchronized void mno(){
		for(int i=0;i<20;i++){
			System.out.println(i+"-"+Thread.currentThread().getName());	
		}
	}
}











