class MyThread extends Thread{
	public void run(){
		System.out.println("~~~~~1");
		System.out.println(Thread.currentThread()+"~~");
	}
}

class B{
	public static void main(String[] args){
		MyThread x = new MyThread();

		x.setName("mohan");
		
		x.start();
		System.out.println("~~~~~2");
		
		System.out.println(Thread.currentThread()+"~");
	}
}