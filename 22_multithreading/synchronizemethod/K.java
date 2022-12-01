class X implements Runnable{
	public void run(){
		synchronized(K.a){
			System.out.println(Thread.currentThread().getName()+" outer");
			try{ Thread.sleep(200);}catch(InterruptedException e){e.printStackTrace();}
			synchronized(K.b){
				System.out.println(Thread.currentThread().getName()+" Inner");
			}
		}
	}
}

class Y implements Runnable{
	public void run(){
		synchronized(K.b){
			System.out.println(Thread.currentThread().getName()+" outer");
			try{ Thread.sleep(200);}catch(InterruptedException e){e.printStackTrace();}
			synchronized(K.a){
				System.out.println(Thread.currentThread().getName()+" Inner");
			}
		}
	}
}

class K{
	static A a = new A();
	static B b = new B();
	
	public static void main(String[] args){
		X x = new X();
		Y y = new Y();
		Thread t1 = new Thread(x,"mohan");
		Thread t2 = new Thread(y,"sohan");
		t1.start(); t2.start();
	}
}