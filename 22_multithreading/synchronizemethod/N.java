import java.io.Console;

class MyRunnable1 implements Runnable{
	public void run(){
		while(true){
			N.n.write();
		}
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		while(true){
			N.n.read();
		}
	}
}

class N{
	static N n = new N();
	int x = 0;

	public static void main(String[] args){
		MyRunnable1 r1 = new MyRunnable1();
		Thread t1 = new Thread(r1,"P");

		MyRunnable2 r2 = new MyRunnable2();
		Thread t2 = new Thread(r2,"C");

		t1.start();
		t2.start();
	}

	synchronized void read(){
		if(x!=0){
			System.out.println("x: "+x+" ~ "+Thread.currentThread().getName());
			x = 0;
		}else{
			notify();
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	synchronized void write(){
		if(x==0){
			System.out.println("Enter a number: ");
			Console c = System.console();
			x = Integer.parseInt(c.readLine());
			System.out.println("x: "+x+" ~ "+Thread.currentThread().getName());
		}else{
			notify();
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}












