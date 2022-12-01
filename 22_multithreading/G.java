class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+" - "+Thread.currentThread().getName());
		   }
		 }
   }
class G
{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r,"mohan");
		Thread t2 = new Thread(r,"sohan");

		t1.start();
		t2.start();

		for(int i=0;i<20;i++){
			System.out.println(i+" - "+Thread.currentThread().getName());
		}
	}
}





































































/*class G extends Thread 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().isAlive());
	}
}
*/
