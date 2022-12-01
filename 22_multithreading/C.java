class MyThread extends Thread{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+"-"+Thread.currentThread().getName());
		}
	}
}

class C{
	public static void main(String[] args){
		MyThread t = new MyThread();

		t.setName("abc");

		t.start();

		for(int i=0;i<20;i++){
			System.out.println(i+"-"+Thread.currentThread().getName());
		}
	}
}