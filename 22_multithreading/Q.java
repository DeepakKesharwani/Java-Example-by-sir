class MyRunnable implements Runnable
{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+" - "+Thread.currentThread().getName());
		}
	}
}
class Q
{
	public static void main(String[] args) throws InterruptedException{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r,"Deepak");
		t.start();
		t.join(50);
		for(int i=0;i<20;i++){
			System.out.println(i+" - "+Thread.currentThread().getName());	
		}
	}
}