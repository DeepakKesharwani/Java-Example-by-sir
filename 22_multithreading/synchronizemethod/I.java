class X implements Runnable{
	public void run(){
		I.abc();
	}
}

class I{
	static A a = new A();

	public static void main(String[] args){
		X x = new X();
		Thread t1 = new Thread(x,"mohan");
		Thread t2 = new Thread(x,"sohan");
		t1.start(); t2.start();
	}

	static void abc(){
		synchronized(a){
			for(int i=0;i<20;i++){
				System.out.println(i+"-"+Thread.currentThread().getName());	
			}
		}
	}
}