class MyRunnable implements Runnable
{
	public void run(){
			System.out.println(Thread.currentThread().getName());
	}
}
class K
{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r,"mohan");
		t.run();

	
	}
}