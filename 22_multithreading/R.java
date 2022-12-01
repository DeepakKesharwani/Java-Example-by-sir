class MyRunnable2 implements Runnable
{
	public void run(){
	for(int i=0;i<10;i++){
		System.out.println(i+" - "+Thread.currentThread().getName());
		}
	}
}

class MyRunnable implements Runnable{
	public void run(){
		Thread t = new Thread(new MyRunnable2(),"ganesh");
		t.start();

		try{
			t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i=0;i<10;i++){
			System.out.println(i+" - "+Thread.currentThread().getName());
		}
	}
}

class R
{
	public static void main(String[] args) throws InterruptedException{
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r,"mohan");
		t.start();
		t.join();

		for(int i=0;i<10;i++){
			System.out.println(i+" - "+Thread.currentThread().getName());
		}
	}
}
		