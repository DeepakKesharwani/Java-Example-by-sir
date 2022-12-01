class MyRunnable implements Runnable 
{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class F
{
	public static void main(String[] args){
		MyRunnable r =new MyRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);

		t1.setPriority(10);
		//t2.setPriority(5);
		t3.setPriority(1);

      System.out.println(t1.getId()+" - "+t1.getName()+" - "+t1.getPriority());
	  System.out.println(t2.getId()+" - "+t2.getName()+" - "+t2.getPriority());
	  System.out.println(t3.getId()+" - "+t3.getName()+" - "+t3.getPriority());

	}
}




































/*class MyRunnable implements Runnable
{
	public void run(){
	for(int i=0;i<12;i++){	
	System.out.println(i+" - "+Thread.currentThread().getName());
	}
}
}

class F extends MyRunnable
{
	public static void main(String[] args){
	MyRunnable r = new MyRunnable();
	
	Thread t1=new Thread(r,"mohan");
	Thread t2=new Thread(r,"sohan");
	t1.start();
	
	t2.start();
	for(int i=0;i<12;i++){
	System.out.println(i+" - "+Thread.currentThread().getName());
		
		
		
	}
	
	}
}*/