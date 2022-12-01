class MyRunnable implements Runnable
{
	public void run(){
	J.pro();
	}
}
class J
{
	public static void main(String[] args){
	MyRunnable r = new MyRunnable();
	Thread t = new Thread(r,"mohan");
	t.run();
	}
	static void pro(){
	System.out.println(Thread.currentThread().getName());
	}

}