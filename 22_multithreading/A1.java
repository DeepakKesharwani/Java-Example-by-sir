 class MyThread implements Runnable
{
	public void run(){
		for(int i=0;i<20;i++){
		System.out.println(i+"~"+Thread.currentThread().getName());
			if(Thread.interrupted()){
				System.out.println("Block thread"+Thread.currentThread().getName());

			}
		}
	}
}

public class A1
{
	public static void main(String[] args) throws InterruptedException{
		MyThread r = new MyThread();
		Thread t1 = new Thread(r,"mohan");
		Thread t2 = new Thread(r,"sohan");
		t1.start();
		t2.start();
		
			t1.interrupt();
		
		for(int i=0;i<20;i++)
			System.out.println(i+"*"+Thread.currentThread().getName());
	} 
}