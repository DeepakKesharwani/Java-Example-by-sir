class MyRunnable1 implements Runnable
{
	public void run(){
		while(true){
		N.n.write();
		}
	}
}
class MyRunnable2 implements Runnable
{
	public void run(){
		while(true){
			N.n.read();
		}
}
class N1
{
	public static void main(){
		MyRunnable1 r1 = new MyRunnable1();
		Thread t1 = new Thread();
		MyRunnable2 r2 = new MyRunnable2();
		Thread t2 = new Thread();
		t1.start();
		t2.start();
	}

	synchronized void read(){
		if(x!=0){
			System.out.println("x:"+x+"~"+Thread.currentThread().getName());
			x=0;
		}else{
			notify();
			try{
				wait();
			}catch(InterruptedException e){
				e.printStakeTrace();
			}

		}
	}


	synchronized void write(){
		if(x==0){
			System.out.println("Enter a number");
			Console c = System.console();
			X=Integer.parseInt(c.readLine());
			System.out.println("x:"+x+"~"+Thread.currentThread().getName());
		}else{
			notify();
			try{
				wait();
			}catch(InterruptedException e){
				e.printStakeTrace();
			}

		}
	}

}