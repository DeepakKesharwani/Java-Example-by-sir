class MyRunnable implements Runnable
{
	public void run(){
	for(int i=0;i<20;i++){
		System.out.println(i+" - "+Thread.currentThread().getName());

		}
	}

}
class N
{
	public static void main(String[] args){
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r,"mohan");
		t.start();

		for(int i=0;i<20;i++){
			if(i<5){
				System.out.println(i+" - "+Thread.currentThread().getName()+"Going to yield");
			   //t.yield();
				Thread.yield();
			}
			System.out.println(i+" - "+Thread.currentThread().getName());

		}
	}
}

























































/*

class MyRunnable implements Runnable
{
	public void run(){
	for(int i=0;i<20;i++){
		System.out.println(i" - "Thread.currentThread().getName());

		}
	}

}
class N
{
	public static void main(String[] args){
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r,"mohan");
		t.start();
		try{
			t.join();
			}catch(InterruptedException e){
				e.getStackTrace();
			}
		for(int i=0;i<20;i++){
			System.out.println(i" + "Thread.currentThread().getName());

		}
	}
}*/