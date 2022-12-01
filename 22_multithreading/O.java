class MyRunnable implements Runnable
{
	public void run(){
		for(int i=0;i<20;i++){
		System.out.println(i+" - "+Thread.currentThread().getName());
	
			}
		}
}
class O
{
	public static void main(String[] args){
		MyRunnable r=new MyRunnable();
		Thread t1=new Thread(r,"Mohan");
		Thread t2=new Thread(r,"Sohan");
		Thread t3=new Thread(r,"Rohan");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}