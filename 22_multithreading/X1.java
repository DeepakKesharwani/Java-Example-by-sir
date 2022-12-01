class MyThread implements Runnable
{
	public void run(){
		for(int i =0;i<=10;i++){
			System.out.println(i+"~"+Thread.currentThread().getName());
		}
	}
}

class X1
{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		Thread t = new Thread(t1);
		
		t.setName("shubhi");
		
		t.start();
		for(int i=0;i<=10;i++){
			System.out.println(i+"*"+Thread.currentThread().getName());
		}
	}
}