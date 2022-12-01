class H
{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().isAlive());
	}
}


















































































































/*class MyRunnable implements Runnable
{
	public void run(){
	//System.out.println(Thread.currentThread().isAlive());
	H.pro();
	}
}

class H extends MyRunnable
{
	public static void main(String[] args){
	MyRunnable r=new MyRunnable();
	Thread t=new Thread(r,"mohan");
	t.run();
	}
	static void pro(){
	
	System.out.println(Thread.currentThread().isAlive());
	}
}
*/