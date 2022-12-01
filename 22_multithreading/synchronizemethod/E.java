class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+" ~ "+Thread.currentThread().getName());
			E.x.pro();
		}	
	}
}

class X{
	private int e = 20;

	//Case 2:
	void pro(){
		//more code
		synchronized(this){
			System.out.println(e);
		}		
		//more code
	}

	//Case 1:
	/*
	synchronized void pro(){
		//more code
		System.out.println(e);
		//more code
	}*/
}

class E{
	static X x = new X();

	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		
		Thread t1 = new Thread(r,"m");
		Thread t2 = new Thread(r,"s");

		t1.start();
		t2.start();
	}
} 