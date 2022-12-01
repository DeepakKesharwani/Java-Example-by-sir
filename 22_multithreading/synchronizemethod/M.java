class MyRunnable implements Runnable{
	public void run(){
		synchronized(M.class){
			for(int i=0;i<20;i++){
				System.out.println(i+" ~ "+Thread.currentThread().getName());
			}	
		}
	}
}

class M{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r,"mohan");

		t.start();
		
		process();
	}

	synchronized static void process(){
		for(int i=0;i<20;i++){
			System.out.println(i+" ~ "+Thread.currentThread().getName());
		}
		
	}
}