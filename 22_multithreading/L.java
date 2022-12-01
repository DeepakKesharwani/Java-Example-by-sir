class MyRunnable implements Runnable

{
	public void run(){
	for(int i=0;i<20;i++){
		System.out.println(i+" ~ "+Thread.currentThread().getName());

		}
	}
}
class L
{
	public static void main(String[] args){
	MyRunnable r = new MyRunnable();
	Thread t = new Thread(r,"mohan");
	t.start();
	try{
		Thread.sleep(800);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	for(int i=0;i<20;i++){
		System.out.println(i+" - "+Thread.currentThread().getName());
	
        	}
		}
}