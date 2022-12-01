class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"--");
	}
}

class D{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.setName("mohan");
		t.start();
		//t.run();

		System.out.println(Thread.currentThread().getName()+"-");
		System.out.println("+++++++++++++++++++++");
	}
}